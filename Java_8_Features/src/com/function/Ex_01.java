package com.function;

import java.util.function.Function;

public class Ex_01 {

	public static void main(String[] args) {

		Function<Integer, Integer> f = i->i*i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(7));
		
		Function<String, Integer> f1 = s->s.length();
		System.out.println("Length of the String : ");
		System.out.println(f1.apply("Suneel Kumar"));
		
		Function<String, String> f2 = s->s.toUpperCase();
		System.out.println(f2.apply("suneel kumar"));
	}

}
