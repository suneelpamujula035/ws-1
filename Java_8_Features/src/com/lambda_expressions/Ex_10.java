package com.lambda_expressions;

interface A{
	void m1();
	void m2();
	default void display()
	{
		System.out.println("This is default method");
	}
}
public class Ex_10 implements A {

	@Override
	public void m1() {
		System.out.println("This is m1 method");
	}

	@Override
	public void m2() {
		System.out.println("This is m1 method");
	}
	@Override
    public void display()//We can also override default methods from parent class
	{
		System.out.println("This is our own default method overrided");
	}
	public static void main(String[] args) {
		Ex_10 e = new Ex_10();
		e.m1();
		e.m2();
		e.display();
	}

}
