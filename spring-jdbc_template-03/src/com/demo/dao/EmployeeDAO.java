package com.demo.dao;

import java.util.List;

import com.demo.entity.Employee;

public interface EmployeeDAO {

	public void save(Employee employee);
	public void saveAll(List<Employee> employees);
	public Employee get(int id);
	public List<Employee> getAll();
	public String delete(int id);
	public void update(Employee employee);
	
}
