package com.lambda_expressions;

interface Left{
	default void m1()
	{
		System.out.println("Left Interface m1()");
	}
}
interface Right{
	default void m1()
	{
		System.out.println("Right Interface m1()");
	}
}
public class Ex_09 implements Left,Right {

	public void m1()
	{
		System.out.println("Our own m1 method");
		//Left.super.m1();
		//Right.super.m1();
	}
	public static void main(String[] args) {

		Ex_09 e = new Ex_09();
		e.m1();
	}

}
