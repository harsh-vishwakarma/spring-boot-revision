package com.springtest.demoapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springtest.demoapp.dao.EmployeeRepository;
import com.springtest.demoapp.entities.Employee;

@Service
public class EmployeeUserServiceImpl implements UserDetailsService{

  @Autowired
  private EmployeeRepository employeeRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Employee employee = employeeRepository.findByEmail(username);
    @SuppressWarnings("deprecation")
    UserDetails user = 
    User.withDefaultPasswordEncoder()
          .username(employee.getEmail())
          .password(employee.getPassword())
          .build();
    return user;
  } 
}
