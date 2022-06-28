package com.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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
	@Around("p1()")
	public void aroundTest(ProceedingJoinPoint jp)
	{
		System.out.println("Before business method");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After business method");
	}
	
	@Pointcut("@annotation(com.demo.anno.MyTx)")
	public void p2()
	{
		
	}
	
	@Before("p2()")
	public void beginTransaction()
	{
		System.out.println("Begin Tx........");
	}
}
