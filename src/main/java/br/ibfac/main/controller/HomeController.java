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

<<<<<<< HEAD
	@PostMapping("/criarPedido")/*OK*/
=======
	@PostMapping
>>>>>>> 21ac4c9cc4dd408e36a38f1368813242aba74505
	@ResponseStatus(HttpStatus.CREATED)	
	public String adicionarPedido(@RequestBody Pedido pedido) throws LancheException {
		homeService.adicionarPedido(pedido);
	    return (pedido.getNome() + " adicionado com sucesso! Boa cantina!");
	}


	/*Informações para a tela Home*/
<<<<<<< HEAD
	@GetMapping/*OK*/
=======
	@GetMapping
>>>>>>> 21ac4c9cc4dd408e36a38f1368813242aba74505
	public List<Pedido> informacoesLanche() {
		return homeService.informacoesLanche();
	}
	
}
