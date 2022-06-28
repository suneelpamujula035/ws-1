package com.lambda_expressions;

public class Ex_07 {

	public static void main(String[] args) {

		//By using Anonymous Inner Class
//		Runnable r = new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i=1; i<=10; i++)
//				{
//					System.out.println("Child Thread");
//				}
//				
//			}
//		};
		
		//By using Lambda Expression
		Runnable r = ()->{
			for(int i=0; i<=10; i++)
			{
				System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=1; i<=10; i++)
		{
			System.out.println("Main Thread");
		}
	}

}
