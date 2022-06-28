package com.lambda_expressions;

public interface Ex_12 {

	default void m1()
	{
		System.out.println("This is default method");
	}
	public static void hello()
	{
		System.out.println("This is hello method");
	}
	public static void main(String[] args) {
		System.out.println("Interface main method");
		Ex_12.hello();
	}
}
