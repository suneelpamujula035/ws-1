package com.lambda_expressions;

interface Lamb {
	void m1();

	void m2();

	void m3();
}

public class Ex_08 {

	public static void main(String[] args) {

		Lamb l = new Lamb() {

			@Override
			public void m3() {
				System.out.println("This is m3 method");
			}

			@Override
			public void m2() {
				System.out.println("This is m2 method");
			}

			@Override
			public void m1() {
				System.out.println("This is m1 method");
			}
		};
		// For Functional interface also we can use Anonymous Inner Class
		l.m1();
		l.m2();
		l.m3();

	}

}
