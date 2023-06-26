package br.ibfac.main.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ibfac.main.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{
<<<<<<< HEAD
//    Usuario findByUsername(String username);
//    
//    Usuario findByPassowrd(String password);
=======
    Usuario findByUsername(String username);
    
    Usuario findByPassowrd(String password);
>>>>>>> 21ac4c9cc4dd408e36a38f1368813242aba74505
}
