package br.ibfac.main.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ibfac.main.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID>{
    Optional<UserModel> findByUsername(String username);
}
