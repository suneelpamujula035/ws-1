package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/api/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public void saveEmployee(@RequestBody Employee employee)
	{
		employeeService.save(employee);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>>getAllEmployees()
	{
		return new ResponseEntity<List<Employee>>(employeeService.get(), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee>getEmployee(@PathVariable int id)
	{
		Employee employee = employeeService.get(id);
		if(employee==null)
		{
			throw new RuntimeException("Employee with id "+id+" is not found");
		}
		return new ResponseEntity<Employee>(employeeService.get(id), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable int id)
	{
		return new ResponseEntity<String>(employeeService.delete(id), HttpStatus.OK);
	}
	
	@PutMapping("/employee")
	public void updateEmployee(@RequestBody Employee employee)
	{
		employeeService.save(employee);
	}
	
}
