package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController //@Controller + @ResponseBody
public class EmployeeController {
	
	@GetMapping("/employees")
	public String getEmployees() {
		return "displaying the list of employees";
	}
	
	@GetMapping("/employees/{id}")
	public String getEmployee(@PathVariable("id") Long id){
		return "employee id is "+id;
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@RequestBody Employee employee) {
		return "saving the employee details to the database "+employee;
	}
	
	@DeleteMapping("/employees")
	public String deleteEmployee(@RequestParam("id") Long id) {
		return "employee with id "+id+" deleted";
	}
}
