package com.demo.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService2 {

	@Pointcut("execution(public void com.demo.dao.EmployeeDAO.getEmployee())")
	public void p3()
	{
		
	}
	
	@AfterReturning("p3()")
	public void beginTx()
	{
		System.out.println("Inside after returning");
	}
	
	@AfterThrowing("p3()")
	public void rollbackTx()
	{
		System.out.println("Inside after throwing");
	}
	
	@Pointcut("execution(public String com.demo.dao.EmployeeDAO.hello())")
	public void p4()
	{
		
	}
	@AfterReturning(value = "p4()", returning = "ob")
	public void hai(Object ob)
	{
		System.out.println("Getting Hello object------"+ob);
	}
}
