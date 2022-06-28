package com.lambda_expressions;

public class Ex_04 {

	public static void main(String[] args) {

		//Using multi threading concept
		Runnable r = () ->{
			for(int i=1; i<=10; i++)
			{
				System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<=10; i++)
		{
			System.out.println("Main Thread");
		}
	}

}
