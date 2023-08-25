package com.springtest.demoapp;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springtest.demoapp.dao.EmployeeRepository;
import com.springtest.demoapp.entities.Employee;

@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoappApplication.class, args);
		ApplicationContext context = SpringApplication.run(DemoappApplication.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		// Employee employeeBean = new Employee();
		// employeeBean.setName("Harshy");
		// employeeBean.setCity("satna");
		// employeeBean.setStatus("What status?");
		// Employee employee = employeeRepository.save(employeeBean);
		// System.out.println(employee);

		/*--------------------------------------------------------- */

		// Iterable<Employee> iterable = employeeRepository.findAll();
		// iterable.forEach(employee-> System.out.println(employee));

		/*--------------------------------------------------------- */

		
		// Iterable<Employee> iterable = employeeRepository.findAll();
		// Iterator<Employee> iterator = iterable.iterator();
		// if(iterator.hasNext()){
		// 	System.out.println(iterator.next());
		// }
		
		/*--------------------------------------------------------- */

		// Optional<Employee> optional = employeeRepository.findById(1);
		// Employee employee = optional.get();
		// System.out.println(employee);
		// try {
		// 	Optional<Employee> optional2 = employeeRepository.findById(2);
		// 	Employee employee2 = optional2.get();
		// 	System.out.println(employee2);
		// } catch (Exception e) {
		// 	System.err.println("Employee with ID " + 2 + " is not present");
		// }

		/*--------------------------------------------------------- */
		
		// List<Employee> employees = employeeRepository.findByName("Harshy");
		// System.out.println(employees);

		/*--------------------------------------------------------- */
		
		// List<Employee> employees = employeeRepository.findByNameLike("%ars%");
		// System.out.println(employees);getAllEmployees

		/*--------------------------------------------------------- */

		// List<Employee> employees = employeeRepository.getAllEmployees();
		// System.out.println(employees);

		/*--------------------------------------------------------- */

		// List<Employee> employees = employeeRepository.getEmployeeByName("Harshy");
		// System.out.println(employees);

		/*--------------------------------------------------------- */

		// List<Employee> employees = employeeRepository.getEmployeeByNameAndCity("Harshy", "satna");
		// System.out.println(employees);

		/*--------------------------------------------------------- */

		// List<Employee> employees = employeeRepository.getEmployees();
		// System.out.println(employees);
	}

}
