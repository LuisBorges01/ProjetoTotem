package br.ibfac.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ibfac.main.model.Lanche;
import br.ibfac.main.repository.LancheRepository;

@Service
public class TesourariaService {
	
	@Autowired
	private LancheRepository lancheRepository;
	
	public List<Lanche> historico() {
		return lancheRepository.findAll();
	}
	
	/*
	 *public UserModel criarResponsavel{}
	 *
	 */
	
}