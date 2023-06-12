package br.ibfac.main.dto;

import java.time.LocalDateTime;

import br.ibfac.main.model.Lanche;
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
				.clNome(lancheDTO.getNome())
				.clValor(lancheDTO.getValor())
				.dataVenda(lancheDTO.getDataVenda())
				.build();
	}
}
