package br.ibfac.main.model;

import java.io.Serializable;

import br.ibfac.main.abstrat.AbstractId;
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
@Table(name = "TB_PEDIDO")
public class Pedido extends AbstractId implements Serializable{

	private static final long serialVersionUID = 1L;


	@Column(name = "CL_NOME", nullable = false)
	private String nome;
	
	@Column(name = "CL_VALOR", nullable = false)
	private Double valor;

	@Column(name = "CL_OBS", nullable = false)
	private String observacao;
	
	  
	@Override
	public Long getId() {
		return super.id;
	}

	@Override
	public void setId(Long id) {
		super.id = id;
	}
}
