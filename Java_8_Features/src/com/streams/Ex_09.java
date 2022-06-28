package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ex_09 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(67);
		l.add(52);
		l.add(13);
		l.add(98);
		l.add(49);
		l.add(52);
		l.add(84);
		l.add(19);
		System.out.println(l);
		//l.stream().forEach(x->System.out.println(x));
		//l.stream().forEach(System.out::println);
		
//		Consumer<Integer> c = i->{
//			System.out.println("The square of "+i+" is "+(i*i));
//		};
//		l.stream().forEach(c);
		l.stream().forEach(i->System.out.println("The square of "+i+" is"+(i*i)));
	}

}
