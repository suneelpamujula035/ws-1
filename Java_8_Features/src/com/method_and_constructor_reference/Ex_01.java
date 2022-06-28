package com.method_and_constructor_reference;

public class Ex_01 {

	public static void m1()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {

//		Ex_01 e1 = new Ex_01();
//		Runnable r = e1::m1();//For non static methods
		Runnable r = Ex_01::m1;//For static methods
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<=10; i++)
		{
			System.out.println("Main Thread");
		}
	}

}
