package com.demo.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Student lokesh = (Student)context.getBean("lokesh");
		lokesh.showDetails();
		
		Student kiran = context.getBean("kiran", Student.class);
		kiran.showDetails();
	}
}
