package com.demo;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex_01 {

	public static void main(String[] args) {

//		Function<Integer, Integer> f = x-> x*x;
//		System.out.println("The square of 40 is "+f.apply(40));
//		System.out.println("The square of 50 is "+f.apply(50));
		
		Predicate<Integer> f = i->i%2==0;
		System.out.println(f.test(4));
		System.out.println(f.test(5));
		
	}

}
