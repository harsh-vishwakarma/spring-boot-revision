package com.springtest.demoapp.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.demoapp.dao.EmployeeRepository;
import com.springtest.demoapp.entities.Employee;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee/{id}/")
    public ResponseEntity<Employee> getEmployee(@PathVariable(value = "id") int id,  HttpServletResponse response){
        Employee employee = employeeRepository.findById(id);
        if(employee == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(employee));
    }

    
    // @GetMapping("/employee/{id}/")
    // public Employee getEmployee(@PathVariable(value = "id") int id,  HttpServletResponse response){
    //     Employee employee = employeeRepository.findById(id);
    //     if(employee == null){
    //         response.setStatus(HttpStatus.NOT_FOUND.value());
    //     }
    //     return employee;
    // }
}
