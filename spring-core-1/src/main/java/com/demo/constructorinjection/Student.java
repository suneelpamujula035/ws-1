package com.demo.constructorinjection;

public class Student {

	private int id;
	private String name;
	
	public Student(int id) {
		super();
		this.id = id;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void showDetails()
	{
		System.out.println("My id is "+id);
		System.out.println("My name is "+ name);
	}
}
