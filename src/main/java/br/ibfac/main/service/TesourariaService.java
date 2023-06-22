package br.ibfac.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ibfac.main.exceptions.LancheException;
import br.ibfac.main.model.Lanche;
import br.ibfac.main.model.Usuario;
import br.ibfac.main.repository.LancheRepository;
import br.ibfac.main.repository.UsuarioRepository;

@Service
public class TesourariaService {
	
	@Autowired
	private LancheRepository lancheRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	/*INFO: MÉTODO PARA GERAR HISTÓRICO DE CANTINA - TesourariaController*/
	public List<Lanche> historico() {
		return lancheRepository.findAll();
	}
	

	/*INFO: MÉTODO PARA CRIAR USUÁRIO - TesourariaController*/
	public String criarUsuario(Usuario usuario) throws Exception {
	    try {
	        usuarioRepository.save(usuario);
	    } catch (Exception e) {
	        throw new LancheException("Erro ao adicionar usuário: " + e.getMessage(), e);
	    }
	    return usuario.getUsername() + " criado com sucesso!";
	}

}