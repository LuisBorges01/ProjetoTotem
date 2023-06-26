package br.ibfac.main.security;
<<<<<<< HEAD
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
/*
=======

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

>>>>>>> 21ac4c9cc4dd408e36a38f1368813242aba74505
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    http.cors().and().csrf().disable()
        .authorizeRequests()
<<<<<<< HEAD
        .anyRequest().permitAll(); //INFO - Esse trecho vc habilita se quiser testar sem autenticação
//        .requestMatchers("/users/login/**").permitAll()
//        .anyRequest().authenticated();
=======
        .requestMatchers("/users/login/**").permitAll()
        .anyRequest().authenticated();
//       .anyRequest().permitAll(); //INFO - Esse trecho vc habilita se quiser testar sem autenticação
>>>>>>> 21ac4c9cc4dd408e36a38f1368813242aba74505
//        .and()
//        .addFilter(new JwtAuthenticationFilter(authenticationManager()))
//        .addFilter(new JwtAuthorizationFilter(authenticationManager()));
    
//INFO: Falta a chamada para o filtro
//EXPLICAÇÃO DA LÓGICA: Compreendi muita coisa e entendi que tudo está girando sobre VERIFICAÇÃO, CRIAÇÃO e AUTORIZAÇÃO;
//    A UsuarioService tem esse objetivo, buscar no banco de dados o nome e senha do usuario, após verificado criar um jwt,
//    ao criar um token, validar(JwtTokenProvider), caso valida-lo, ter autorizações para os endpoints;
//    
//    OBS: O usuário é criado na TesourariaService e não na Usuario. 
    return http.build();
  	}
}

<<<<<<< HEAD
//TODO - só precisa implementar o login para gerar o token e depois mapear aqui um método oara decriptar o token
*/
	
=======
//TODO - só precisa implementar o login para gerar o token e depois mapear aqui um método oara decriptar o token
>>>>>>> 21ac4c9cc4dd408e36a38f1368813242aba74505
