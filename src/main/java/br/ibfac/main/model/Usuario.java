package br.ibfac.main.model;

import br.ibfac.main.commons.AbstractEntity;
import br.ibfac.main.commons.Papel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table
public class Usuario extends AbstractEntity {

  private static final long serialVersionUID = 1L;

@Column(nullable = false, unique = true)
  private String username;

  @Column(nullable = false)
  private String password;
  
  @Column(nullable = false, unique = true)
  private Papel papel;
}