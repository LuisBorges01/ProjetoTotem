package br.ibfac.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ibfac.main.model.Lanche;
import br.ibfac.main.model.Usuario;
import br.ibfac.main.repository.UsuarioRepository;
import br.ibfac.main.service.TesourariaService;
@RestController
@RequestMapping("/tesouraria")
public class TesourariaController {
	
	@Autowired
	private TesourariaService tesourariaService;
	
	
	/*Relatório de cantinas*/
	@GetMapping("/historicoCasntinas")
<<<<<<< HEAD
	@ResponseStatus(HttpStatus.OK)/*OK*/
=======
	@ResponseStatus(HttpStatus.OK)
>>>>>>> 21ac4c9cc4dd408e36a38f1368813242aba74505
	public List<Lanche> historico() {
		return tesourariaService.historico();
	}
	
	@PostMapping("/criarUsuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public String criarUsuario(@RequestBody Usuario usuario) throws Exception{
		return tesourariaService.criarUsuario(usuario);
	}
	
	/*
	 *@PostMapping
	 * public UserModel criarResponsavel(){}
	 * */
	
}