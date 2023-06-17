package br.ibfac.main.model;

import br.ibfac.main.commons.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Usuario extends AbstractEntity {

  @Column(nullable = false, unique = true)
  private String username;

  @Column(nullable = false)
  private String password;

}