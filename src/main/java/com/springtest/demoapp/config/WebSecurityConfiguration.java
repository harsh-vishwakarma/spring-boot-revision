package com.springtest.demoapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.springtest.demoapp.services.EmployeeUserServiceImpl;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class WebSecurityConfiguration {

  @Bean
  public UserDetailsService userDetailsService(){
    return new EmployeeUserServiceImpl();
  }

  @SuppressWarnings("deprecation")
  @Bean
  public AuthenticationProvider authenticationProvider() {
    DaoAuthenticationProvider provider= new DaoAuthenticationProvider();
    provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
    provider.setUserDetailsService(userDetailsService());
    return provider;
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http.authorizeHttpRequests((authz) -> authz
        .requestMatchers("/","/error","/error/**").permitAll()
        .anyRequest().authenticated()
      ).httpBasic(withDefaults());
    return http.build();
  };
}

  // @Bean
  // public UserDetailsService userDetailsService() {
  //   @SuppressWarnings("deprecation")
  //   UserDetails user = 
  //           User.withDefaultPasswordEncoder()
  //               .username("email")
  //               .password("password")
  //               .build();

  //  return new InMemoryUserDetailsManager(user);
  // }

// public UserDetails loadUserByUsername(String username) {
//   Employee employee = employeeRepository.findByEmail(username);
//   @SuppressWarnings("deprecation")
//   UserDetails user = 
//           User.withDefaultPasswordEncoder()
//               .username(employee.getEmail())
//               .password(employee.getPassword())
//               .build();
//  return user;
// }