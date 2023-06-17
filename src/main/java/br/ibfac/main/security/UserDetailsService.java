package br.ibfac.main.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.ibfac.main.model.UserModel;
import br.ibfac.main.repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/*INFO: Método de busca criado*/
		UserModel userModel = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado" + username));
		/*INFO: A classe User cria de forma padronizada o usuário passando os nosso parâmetros quando optado.
		 *O .getAuthorities busca os Roles autenticados.*/
        return new User(userModel.getUsername(), userModel.getPassword(), true, true, true,true, userModel.getAuthorities());
    }

}
