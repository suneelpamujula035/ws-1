package com.streams;

import java.util.stream.Stream;

public class Ex_11 {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(12,45,98,45,89,12,88,34,78);
		s.forEach(System.out::println);
//		Integer minValue = s.min((i1,i2)->i1.compareTo(i2)).get();
//		Integer maxValue = s.max((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println("Minium Value : "+minValue);
//		System.out.println("Maximum Value : "+maxValue);
		
		System.out.println("--------------------------------");
		Integer arr[] = {10,20,30,40,50,60};
		Stream.of(arr).forEach(System.out::println);
		System.out.println("--------------------------------");
		Stream.of(22,33,44,55,66,77).forEach(System.out::println);
	}

}
