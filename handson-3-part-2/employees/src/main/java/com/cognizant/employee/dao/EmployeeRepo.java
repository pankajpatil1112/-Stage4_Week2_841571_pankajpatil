package com.cognizant.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.employee.model.Employee;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
