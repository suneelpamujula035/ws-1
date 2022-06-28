package com.function;

import java.util.function.Function;

public class Ex_04 {

	public static void main(String[] args) {

//		Function<Integer, Integer> f1 = i->2*i;//2*2=4
//		Function<Integer, Integer> f2 = i->i*i*i;//4*4*4
//		System.out.println(f1.andThen(f2).apply(2));//64
		
		Function<Integer, Integer> f1 = i->2*i;//2*8=16
		Function<Integer, Integer> f2 = i->i*i*i;//2*2*2=8
		System.out.println(f1.compose(f2).apply(2));//16
	}

}
