package br.ibfac.main.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ibfac.main.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{
//    Usuario findByUsername(String username);
//    
//    Usuario findByPassowrd(String password);
}
