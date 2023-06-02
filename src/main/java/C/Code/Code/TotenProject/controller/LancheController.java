package C.Code.Code.TotenProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import C.Code.Code.TotenProject.Model.Lanche;
import C.Code.Code.TotenProject.exceptions.LancheException;
import C.Code.Code.TotenProject.service.LancheService;

@RestController
@RequestMapping("/lanche")
public class LancheController {
	
	@Autowired
	private LancheService lancheService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String adicionar(@RequestBody Lanche lanche) throws LancheException {
	    if (lanche.getValor() == null) {
	        throw new LancheException("O valor do lanche é obrigatório.");
	    }
	    
	    try {
	        Lanche lancheCriado = lancheService.adicionar(lanche);
	        return (lancheCriado.getNome() + " com sucesso! <br>Boa cantina!");
	    } catch (LancheException e) {
	        throw new LancheException("Erro ao criar lanche: " + e.getMessage(), e);
	    }
	}


}
