package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	
	@DeleteMapping("/employees")
	public String deleteEmployee(@RequestParam("id") Long id) {
		return "employee with id "+id+" deleted";
	}
}
