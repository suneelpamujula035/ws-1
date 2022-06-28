package com.demo.dao;

import java.util.Random;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
public class EmployeeDAO {

	public void saveEmployee()
	{
		System.out.println("From save employee");
	}
	public void getEmployee()
	{
		System.out.println("From get employee");
//		if(new Random().nextInt(15)<=10)
//		{
//			throw new RuntimeException("DUMMY");
//		}
	}
	public void updateEmployee()
	{
		System.out.println("From update employee");
	}
	public void deleteEmployee()
	{
		System.out.println("From delete employee");
	}
	
	public String hello()
	{
		return "Good Morning";
	}
}
