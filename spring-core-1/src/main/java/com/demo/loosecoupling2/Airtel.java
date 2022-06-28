package com.demo.loosecoupling2;

public class Airtel {

	private Service serv;

	public void setServ(Service serv) {
		this.serv = serv;
	}

	public void activate()
	{
		System.out.println("From Airtel network");
		serv.service();
	}
}
