package br.ibfac.main.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    http.cors().and().csrf().disable()
        .authorizeRequests()
        .requestMatchers("/users/login/**").permitAll()
        //.anyRequest().permitAll(); -- este trecho vc habilita se quiser testar sem autenticação
        .anyRequest().authenticated(); // e desabilita esse

    //TODO - só precisa implementar o login para gerar o token e depois mapear aqui um método oara decriptar o token

    return http.build();
  }

}
