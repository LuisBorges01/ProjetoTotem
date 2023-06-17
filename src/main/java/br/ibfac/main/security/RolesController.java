package br.ibfac.main.security;

import java.util.UUID;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ibfac.main.model.UserModel;

@RestController
@RequestMapping("/usuarios")
public class RolesController {
	/*INFO: Essa classe foi implementada com a necessidade
	 *da criação dos usuários e suas respectivas roles*/
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/cadastro")
    public String cadastrarUsuario(@RequestBody UserModel modelo) {
    	UUID uuid = UUID.randomUUID();

    	UserModel userModel = new UserModel();
    	userModel.setUsername(modelo.getUsername());
    	userModel.setPassword(modelo.getPassword());
    	userModel.setUserId(uuid);
    	userModel.setRoles(modelo.getRoles());
    	return "Usuário criado com sucesso!";
    }

}
