package br.ibfac.main.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_ROLE")
public class RoleModel {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private UUID userId;
}
