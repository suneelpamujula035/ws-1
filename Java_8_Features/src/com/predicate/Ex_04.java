package com.predicate;

import java.util.function.BiPredicate;

public class Ex_04 {

	public static void main(String[] args) {

		//It takes two parameters as the input
		BiPredicate<Integer, Integer> p = (a,b)->(a+b)%2==0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(20, 35));
	}

}
