package br.ibfac.main.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ibfac.main.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{
    Optional<Usuario> findByUsername(String username);
}
