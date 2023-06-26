package br.ibfac.main.model;

import br.ibfac.main.commons.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Getter
@Setter
@Table
public class Lanche extends AbstractEntity {

  private static final long serialVersionUID = 1L;

@Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  private Double valor;

  @CreationTimestamp
  private LocalDateTime dataVenda;

}
