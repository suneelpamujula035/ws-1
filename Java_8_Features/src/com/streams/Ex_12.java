package com.streams;

import java.util.Arrays;
import java.util.List;

public class Ex_12 {

	public static void main(String[] args) {

//		Integer arr[] = {23,17,90,34,98,64,7,87,65};
//		List<Integer> l = Arrays.asList(arr);
//		System.out.println(l);
//		System.out.println("------------------------------");
//		l.forEach(s->System.out.println(s));
//		System.out.println("------------------------------");
//		l.stream().forEach(System.out::println);
//		System.out.println("------------------------------");
//		for(Integer i1:l)
//		{
//			System.out.println(i1);
//		}
//		Integer minValue = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println("Min value : "+minValue);
//		Integer maxVal = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println("Max value : "+maxVal);
		
		Integer arr[] = {23,17,90,34,98,64,7,87,65};
		List<Integer> l = Arrays.asList(arr);
		Integer maxVal = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max value : "+maxVal);
	}

}
