package com.lambda_expressions;

public class LambdaTest {

	public static void main(String[] args) {

//		Ex_01 i = () -> System.out.println("Hello World!");
//		i.m1();//We can call these Lambda Expressions for any number of times
//		i.m1();
//		i.m1();
//		i.m1();
		
//		Ex_02 i2 = (a, b) -> System.out.println("The sum : "+(a+b));
//		i2.add(20, 30);
//		i2.add(4, 9);
		
		Ex_03 i3 = n -> n*n;
		System.out.println(i3.squareIt(4));
		System.out.println(i3.squareIt(5));
	}

}
