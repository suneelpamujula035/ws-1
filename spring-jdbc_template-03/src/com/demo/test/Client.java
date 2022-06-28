package com.demo.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.dao.EmployeeDAO;
import com.demo.dao.EmployeeDAOImpl;
import com.demo.entity.Employee;
import com.demo.helper.HelperDAO;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeDAOImpl e = context.getBean("employeeDAOImpl", EmployeeDAOImpl.class);
//		Employee e1 = new Employee(103,"Harsh",24986.53);
//		e.save(e1);
//		HelperDAO h = context.getBean("helperDAO", HelperDAO.class);
//		h.addBatchOfEmployees();
		System.out.println("-------------------------");
		System.out.println("Employee by id : ");
		System.out.println(e.get(104));
		System.out.println("-------------------------");
		System.out.println("Get All Employees : ");
		List<Employee> ListOfEmployees = e.getAll();
		for(Employee emp : ListOfEmployees)
		{
			System.out.println(emp);
		}
		System.out.println("-------------------------");
		System.out.println("Delete Employee by id : ");
		System.out.println(e.delete(105));
		System.out.println("-------------------------");
		System.out.println("Update employee : ");
		Employee emp = new Employee();
		emp.setId(108);
		emp.setName("fahim");
		e.update(emp);
	}

}
