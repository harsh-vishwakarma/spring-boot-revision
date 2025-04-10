package com.springtest.demoapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class WebSecurityConfiguration {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http.authorizeHttpRequests((authz) -> authz
        .requestMatchers("/","/error","/error/**").permitAll()
        .anyRequest().authenticated()
      ).httpBasic(withDefaults());
    return http.build();
  };

  @Bean
  public UserDetailsService userDetailsService() {
    @SuppressWarnings("deprecation")
    UserDetails user = 
            User.withDefaultPasswordEncoder()
                .username("email")
                .password("password")
                .build();

   return new InMemoryUserDetailsManager(user);
  }
}