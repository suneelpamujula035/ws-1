package com.demo.ioc;

public class Vodaphone implements Sim {
	
	public Vodaphone() {
		System.out.println("Vodaphone constructor called");
	}
	public void calling() {
		System.out.println("Calling using Vodaphone");
	}

	public void data() {
		System.out.println("Data using Vodaphone");
	}

}
