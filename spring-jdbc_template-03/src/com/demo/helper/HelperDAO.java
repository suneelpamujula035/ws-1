package com.demo.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.dao.EmployeeDAOImpl;
import com.demo.entity.Employee;

@Component
public class HelperDAO {

	@Autowired
	EmployeeDAOImpl employeeDAOImpl;
	
	public void addBatchOfEmployees()
	{
		Employee e1 = new Employee(104,"sudarshan",22000);
		Employee e2 = new Employee(105,"salman",45000);
		Employee e3 = new Employee(106,"nishanth",32000);
		Employee e4 = new Employee(107,"vishal",160500);
		Employee e5 = new Employee(108,"vinod",2346.18);
		
		List<Employee> l = new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		employeeDAOImpl.saveAll(l);
	}
}
