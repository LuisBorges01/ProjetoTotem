package br.ibfac.main.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USER")
public class UserModel{
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private UUID userId;
}