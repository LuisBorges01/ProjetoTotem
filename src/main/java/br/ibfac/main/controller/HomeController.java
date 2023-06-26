package br.ibfac.main.controller;

import br.ibfac.main.exceptions.LancheException;
import br.ibfac.main.model.Pedido;
import br.ibfac.main.service.HomeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lanche")
public class HomeController {
	
	@Autowired
	private HomeService homeService;

	@PostMapping("/criarPedido")/*OK*/
	@ResponseStatus(HttpStatus.CREATED)	
	public String adicionarPedido(@RequestBody Pedido pedido) throws LancheException {
		homeService.adicionarPedido(pedido);
	    return (pedido.getNome() + " adicionado com sucesso! Boa cantina!");
	}


	/*Informações para a tela Home*/
	@GetMapping/*OK*/
	public List<Pedido> informacoesLanche() {
		return homeService.informacoesLanche();
	}
	
}
