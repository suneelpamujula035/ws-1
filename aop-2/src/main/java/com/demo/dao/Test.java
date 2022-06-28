package com.demo.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.configuration.Aop_Config;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Aop_Config.class);
		EmployeeDAO e = context.getBean("employeeDAO",EmployeeDAO.class);
		e.saveEmployee();
		e.getEmployee();
	}
}
