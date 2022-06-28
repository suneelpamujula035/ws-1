package com.demo.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean {

	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init method");
		
	}

}
