package com.demo.annotations2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(InstituteConfig.class);
		Institute institute = context.getBean("institute", Institute.class);
		institute.instituteInfo();
	}

}
