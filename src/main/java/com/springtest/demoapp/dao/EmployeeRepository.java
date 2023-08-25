package com.springtest.demoapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springtest.demoapp.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
    public Employee findById(int id);
    public List<Employee> findByName(String name);
    public List<Employee> findByNameLike(String name);

    @Query("select e from Employee e")
    public List<Employee> getAllEmployees();

    @Query("select e from Employee e where e.name= :n")
    public List<Employee> getEmployeeByName(@Param("n") String name);

    @Query("select e from Employee e where e.name= :n and e.city =:c")
    public List<Employee> getEmployeeByNameAndCity(@Param("n") String name, @Param("c") String city);

    @Query(value = "select * from Employee", nativeQuery = true) 
    public List<Employee> getEmployees();
}
