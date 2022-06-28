package com.demo.loosecoupling1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext  context = new ClassPathXmlApplicationContext("beans4.xml");
		Student guru = context.getBean("guru", Student.class);
		guru.cheating();
	}

}
