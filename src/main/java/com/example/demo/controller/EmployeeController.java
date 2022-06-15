package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //@Controller + @ResponseBody
public class EmployeeController {
	// localhost:8080/employees
	
	@RequestMapping(value = "/employees", method=RequestMethod.GET)
//	@ResponseBody
	public String getEmployees() {
		return "displaying the list of employees";
	}
}
