package com.demo.loosecoupling1;

public class Student {

	private Cheat ch;

	public void setCh(Cheat ch) {
		this.ch = ch;
	}
	
	public void cheating()
	{
		ch.cheat();
	}
}
