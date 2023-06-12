package br.ibfac.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ibfac.main.model.Lanche;
import br.ibfac.main.service.TesourariaService;
@RestController
@RequestMapping("/tesouraria")
public class TesourariaController {
	
	@Autowired
	private TesourariaService tesourariaService;
	
	/*Relatório de cantinas*/
	@GetMapping("/historicoCantinas")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Lanche> historico() {
		return tesourariaService.historico();
	}
	
	/*
	 *@PostMapping
	 * public UserModel criarResponsavel(){}
	 * */
	
}