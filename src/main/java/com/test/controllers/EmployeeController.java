package com.test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Employee;

@RestController
@RequestMapping(value="/rest")
public class EmployeeController {
		@GetMapping(value="/getemployee")
		public Employee getEmployee() {
				Employee emp=new Employee();
				emp.setFirstName("Rajkumar");
				emp.setLastName("Katanor");
				emp.setId(1266);
				emp.setAddress("Hyderabad");
				emp.setSalary("$80000");
				return emp;
		}
}
