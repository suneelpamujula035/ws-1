package com.demo.objectinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		Student fahim = context.getBean("fahim", Student.class);
		fahim.cheat();
		
		AnotherStudent gulam = context.getBean("gulam", AnotherStudent.class);
		gulam.cheating();
	}

}
