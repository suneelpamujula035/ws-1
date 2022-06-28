package com.demo.loosecoupling2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
		Airtel airtel = context.getBean("airtel",Airtel.class);
		airtel.activate();
		
	}

}
