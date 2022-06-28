package com.demo.dao;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.demo.anno.MyTx;

@EnableAspectJAutoProxy
@Component
public class EmployeeDAO {

	public void saveEmployee()
	{
		System.out.println("From save employee");
	}
	
	@MyTx
	public void getEmployee()
	{
		System.out.println("From get employee");
	}

}
