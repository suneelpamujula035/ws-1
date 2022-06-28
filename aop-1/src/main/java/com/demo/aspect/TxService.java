package com.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {

	@Pointcut("execution(public void com.demo.dao.EmployeeDAO.saveEmployee())")
	public void p1()
	{
		
	}
	@Before("p1()")//This is called joinPoint
	public void beginTransaction()
	{
		System.out.println("Transaction started");
	}
	@After("p1()")
	public void afterTransaction()
	{
		System.out.println("Transaction commited");
	}
	
	@Pointcut("execution(public void com.demo.dao.EmployeeDAO.deleteEmployee())")
	public void p2()
	{
		
	}
	@Before("p2()")
	public void checkEmployeeExistance()
	{
		System.out.println("Inside checking employee existance");
	}
}
