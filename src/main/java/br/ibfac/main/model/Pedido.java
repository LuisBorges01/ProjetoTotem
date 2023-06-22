package br.ibfac.main.model;

import br.ibfac.main.commons.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table
public class Pedido extends AbstractEntity {

	@Column(nullable = false)
	private String nome;
	
	@Column( nullable = false)
	private Double valor;

	@Column(nullable = false)
	private String observacao;

}
