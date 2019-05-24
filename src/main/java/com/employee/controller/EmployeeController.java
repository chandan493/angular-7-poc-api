package com.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeController {

	@Autowired
	private EmployeeDAO employeeDAO;

	@GetMapping(value = "/employees")
	public List<Employee> getAllEmployee() {
		return (List<Employee>) employeeDAO.findAll();
	}

	@PostMapping(value = "/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeDAO.save(employee);
		return employee;
	}

	@DeleteMapping(value = "/deleteEmployee/{id}")
	public Map<String,String> deleteEmployee(@PathVariable("id") Integer id) {
		Map<String,String> response=new HashMap<>();
		try {
			employeeDAO.deleteById(id);
			response.put("response", "Deleted successfully");
		} catch (Exception e) {
			response.put("response", e.getMessage());
		}
		return response;
	}

	@GetMapping(value = "/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id") Integer id) {
		return employeeDAO.findById(id);
	}

	@PutMapping(value = "/updateEmployee")
	public Map<String, String> updateEmployee(@RequestBody Employee employee) {
		Map<String, String> response = new HashMap<>();
		try {
			employeeDAO.save(employee);
			response.put("response", "Updated Successfully");
		} catch (Exception e) {
			response.put("response", e.getMessage());
		}
		return response;

	}

}
