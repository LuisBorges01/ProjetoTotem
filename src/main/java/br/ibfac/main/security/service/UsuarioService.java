package br.ibfac.main.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ibfac.main.exceptions.LancheException;
import br.ibfac.main.model.Usuario;
import br.ibfac.main.repository.UsuarioRepository;
import br.ibfac.main.security.JwtTokenProvider;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	boolean noVerification;
	
	/*INFO: BUSCANDO USUÁRIO NO BANCO DE DADOS PARA AUTENTICAÇÃO*/
	public String buscandoUsuario(String nomeUsuario, String senha) throws LancheException {
	    try {
	        Usuario usuario = usuarioRepository.findByUsername(nomeUsuario);/*POSSÍVIEL ERRO*/
	        if (usuario == null) {
	            System.out.println("Usuário não identificado (UsuarioService): " + nomeUsuario);
	            return null;
	        } else {
	            Usuario senhaUsuario = usuarioRepository.findByPassowrd(senha); /*POSSÍVIEL ERRO*/
	            if (!senha.equals(senhaUsuario.getPassword())) {
	                System.out.println("Senha inválida para o usuário: " + nomeUsuario);
	                return null;
	            } else {
	                JwtTokenProvider jwtTokenProvider = new JwtTokenProvider();
	                String token = jwtTokenProvider.generateToken(nomeUsuario);
	                return token;
	            }
	        }
	    } catch (Exception e) {
	        throw new LancheException("Erro ao buscar usuário (UsuarioService): " + e.getMessage(), e);
	    }
	}

	/*Na JwtTokenProvider tem um método que válida*/
	public boolean validarToken(String token) {
	    JwtTokenProvider jwtTokenProvider = new JwtTokenProvider();
	    return jwtTokenProvider.validateToken(token);
	}

	
}
