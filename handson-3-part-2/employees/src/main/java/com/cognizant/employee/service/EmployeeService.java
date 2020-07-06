package com.cognizant.employee.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cognizant.employee.model.Employee;
@Service
public interface EmployeeService {
     public ArrayList<Employee> getAllEmployee();
     public void addEmployee();
}
