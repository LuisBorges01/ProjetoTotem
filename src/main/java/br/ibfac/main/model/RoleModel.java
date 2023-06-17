package br.ibfac.main.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;

import br.ibfac.main.enums.RoleName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_ROLE")
public class RoleModel implements GrantedAuthority, Serializable{
/*GrantedAuthority ajuda na implementação dos niveis de acesso do usuário*/
	private static final long serialVersionUID = 1L;
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private UUID userId;
	 
	 	@Enumerated(EnumType.STRING)
	 	@Column(nullable = false, unique = true)
	 	private RoleName roleName;
	
		@Override
		public String getAuthority() {
	        return this.roleName.toString();
		}
}
