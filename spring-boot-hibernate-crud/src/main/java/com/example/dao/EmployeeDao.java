package com.example.dao;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeDao {

	public void save(Employee employee);
	public List<Employee> get();
	public Employee get(int id);
	public String delete(int id);
}
