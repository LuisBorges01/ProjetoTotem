package C.Code.Code.TotenProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import C.Code.Code.TotenProject.Model.Lanche;
import C.Code.Code.TotenProject.repository.LancheRepository;

@Service
public class TesourariaService {
	
	@Autowired
	private LancheRepository lancheRepository;
	
	public List<Lanche> historico() {
		return lancheRepository.findAll();
	}
}
