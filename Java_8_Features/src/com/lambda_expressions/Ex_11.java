package com.lambda_expressions;

interface Interf{
	public static void m1()//Interface static method only call by using Interface name only
	{
		System.out.println("This is Interface static method");
	}
}
public class Ex_11 {

	public static void main(String[] args) {
		
		Interf.m1();
	}

}
