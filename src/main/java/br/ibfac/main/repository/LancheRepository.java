package br.ibfac.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ibfac.main.model.Lanche;

public interface LancheRepository extends JpaRepository<Lanche, Long>{

	public Double findFirstByOrderByClValorAsc();

	public String findFirstByOrderByClNomeAsc();
}
