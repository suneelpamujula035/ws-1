package com.demo.annotations1;

import org.springframework.stereotype.Component;

@Component
public class Principal {

	public void principalInfo()
	{
		System.out.println("Hey I'm your new principal");
		System.out.println("My name is James Bond");
	}
}
