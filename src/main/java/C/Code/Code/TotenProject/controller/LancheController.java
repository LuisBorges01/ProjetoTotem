package C.Code.Code.TotenProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import C.Code.Code.TotenProject.Model.Lanche;
import C.Code.Code.TotenProject.service.LancheService;

@RestController
@RequestMapping("/lanche")
public class LancheController {
	
	@Autowired
	private LancheService lancheService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Lanche salvar(@RequestBody Lanche lanche) {
		return lancheService.adicionar(lanche);
	}

}
