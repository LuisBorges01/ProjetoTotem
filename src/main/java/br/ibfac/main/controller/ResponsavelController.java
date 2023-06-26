package br.ibfac.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ibfac.main.dto.LancheDTO;
import br.ibfac.main.exceptions.LancheException;
import br.ibfac.main.model.Lanche;
import br.ibfac.main.service.ResponsavelService;

@RestController
@RequestMapping("/responsavel")
public class ResponsavelController {
	
	@Autowired
	ResponsavelService responsavelService;
	
	
	/*Salvar pedido - SOMENTE RESPONSÁVEL(ROLE_RESPONSAVEL)*/
	@PostMapping("/adicionar") /*OK*/
	@ResponseStatus(HttpStatus.CREATED)
	public String adicionar(@RequestBody LancheDTO lancheDTO) throws LancheException {
		Lanche lanche = LancheDTO.toEntity(lancheDTO);
		responsavelService.adicionar(lanche);
        return (lancheDTO.getNome() + " adicionado com sucesso! Boa cantina!");
	}
	
    /*Valor Total Cantina(Botão) - MÉTODO EM ANÁLISE 
     *SOMENTE RESPONSÁVEL(ROLE_RESPONSAVEL)*/
	@GetMapping("/totalValores")/*OK*/
	public Double totalCantina() {
		responsavelService.setCantinaFinalzada(true);
		return responsavelService.totalCantina();
	}
}
