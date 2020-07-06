package com.cognizant.employee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employee.dao.EmployeeRepo;
import com.cognizant.employee.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo er;

	@Override
	public ArrayList<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		er.findAll().forEach(a->list.add(a));
		return list;
		
	}

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		er.save(new Employee(5, "pankaj"));
		er.save(new Employee(6, "pratik"));
		er.save(new Employee(7, "harshal"));
		er.save(new Employee(8, "vandan"));

	}

}
