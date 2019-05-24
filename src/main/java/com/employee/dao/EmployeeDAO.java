package com.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository(value="employeeDAO")
public interface EmployeeDAO extends CrudRepository<Employee, Integer>  {

}
