package com.demo.setterinjection;

public class Student {

	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void showDetails()
	{
		System.out.println("My id is "+id);
		System.out.println("My name is "+ name);
	}
}
