package com.demo.ioc;

public class Airtel implements Sim {

	public Airtel() {
		System.out.println("Airtel constructor called");
	}
	public void calling() {
		System.out.println("Calling using Airtel");
	}

	public void data() {
		System.out.println("Data using Airtel");
	}
}
