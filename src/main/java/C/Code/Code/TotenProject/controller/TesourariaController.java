package C.Code.Code.TotenProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import C.Code.Code.TotenProject.Model.Lanche;
import C.Code.Code.TotenProject.service.TesourariaService;



@RestController
@RequestMapping("/tesouraria")
public class TesourariaController {
	
	@Autowired
	private TesourariaService tesourariaService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.CREATED)
	public List<Lanche> historico() {
		return tesourariaService.historico();
	}
}
