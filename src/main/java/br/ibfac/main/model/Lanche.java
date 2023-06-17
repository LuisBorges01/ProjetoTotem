package br.ibfac.main.model;

import br.ibfac.main.commons.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table
public class Lanche extends AbstractEntity {

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  private Double valor;

  @CreationTimestamp
  private LocalDateTime dataVenda;

}
