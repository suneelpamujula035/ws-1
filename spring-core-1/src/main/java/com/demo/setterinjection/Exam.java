package com.demo.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		Student pawan = context.getBean("pawan",Student.class);
		pawan.showDetails();
		
		Student naresh = context.getBean("naresh",Student.class);
		naresh.showDetails();
	}
}
