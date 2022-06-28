package com.supplier;

import java.util.function.Supplier;

public class Ex_02_OTP_Generation {

	public static void main(String[] args) {
		Supplier<String> s = ()->{
			String otp = "";
			for(int i=0; i<6; i++)
			{
				otp = otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
