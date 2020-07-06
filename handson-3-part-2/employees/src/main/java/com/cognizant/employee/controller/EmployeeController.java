package com.cognizant.employee.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employee.dao.EmployeeRepo;
import com.cognizant.employee.model.Employee;
import com.cognizant.employee.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/")
	public String hii() {
		return "hii pankaj";
	}
	@GetMapping("/add")
	public String addEmployee(){
		employeeService.addEmployee();
		return "add";
	}
	@GetMapping("view")
	public ArrayList<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
}
