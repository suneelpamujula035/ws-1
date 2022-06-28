package com.demo;

import java.util.Optional;

public class Ex_02 {

	public static void main(String[] args) {

		String s[] = new String[5];
		s[0]="suneel";
		s[1]="pawan";
		System.out.println(s[0].toUpperCase());
		//System.out.println(s[3].length());
		//System.out.println(s[3].toUpperCase());
		
		Optional<String> o = Optional.ofNullable(s[3]);
		System.out.println(o);
		Optional<String> o1 = Optional.ofNullable(s[0]);
		System.out.println(o1);
		if(o.isPresent())
		{
			System.out.println("Value existed...."+o.get()+"------------"+o.get().toUpperCase());
		}
		else
		{
			System.out.println("Value not existed....");
		}
	}

}
