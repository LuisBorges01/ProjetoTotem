package br.ibfac.main.abstrat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractId {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public abstract void setId(Long id);
	/*Para obrigar o set do id*/
	public abstract Long getId();
}
