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
        Lanche lanche = new Lanche();
        lanche.setNome(lancheDTO.getNome());
        lanche.setValor(lancheDTO.getValor());
        return lanche;
    }
}
