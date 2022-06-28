package com.demo.autowiring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");
		Human suneel = context.getBean("suneel", Human.class);
		suneel.check();
	}

}
