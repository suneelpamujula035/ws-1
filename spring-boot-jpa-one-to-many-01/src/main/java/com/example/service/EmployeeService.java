package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {

	public String save(Employee employee);
	public List<Employee> getAll();
	public Employee getById(int id);
	public String update(Employee employee, int id);
	public String delete(int id);
}
