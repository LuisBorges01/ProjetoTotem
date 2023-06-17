package br.ibfac.main.dto;

import br.ibfac.main.model.Lanche;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LancheDTO {
	
	private String nome;
	private Double valor;
	private LocalDateTime dataVenda;

	public static Lanche toEntity(LancheDTO lancheDTO) {
		return Lanche.builder()
				.nome(lancheDTO.getNome())
				.valor(lancheDTO.getValor())
				.dataVenda(lancheDTO.getDataVenda())
				.build();
	}
}
