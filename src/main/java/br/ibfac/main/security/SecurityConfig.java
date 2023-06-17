package br.ibfac.main.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
	      http
          .httpBasic()
          .and()
          .authorizeHttpRequests()
          .anyRequest().authenticated()
          .and()
          .csrf().disable();
	      return http.build();
	      /*INFO: A @EnableMethodSecurity serve para declararmos em cima de cada método
	       * qual método recebe determinado acesso. Exemplo: apenas admins podem usar o DELETE*/
	}

	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}