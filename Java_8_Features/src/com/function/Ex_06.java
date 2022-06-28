package com.function;

import java.util.function.IntFunction;

public class Ex_06 {

	public static void main(String[] args) {

		IntFunction f = i->i*i;
		System.out.println(f.apply(4));
	}

}
