package com.consumer;

import java.util.function.Consumer;

public class Ex_01 {

	public static void main(String[] args) {

		//It accepts only string values
		Consumer<String> c = s->System.out.println(s);//Consumer is just for printing purpose
		c.accept("suneel");
		c.accept("Vicky");
	}

}
