package com.demo.ioc;

public class Jio implements Sim{
	
	public Jio() {
		System.out.println("Jio constructor called");
	}
	public void calling() {
		System.out.println("Calling using Jio");
	}

	public void data() {
		System.out.println("Data using Jio");
	}

}
