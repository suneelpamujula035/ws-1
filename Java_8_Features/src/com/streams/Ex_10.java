package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex_10 {

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
		//Integer[] arr = (Integer[]) l.toArray();
		//By default collection object have stream object
		Integer arr[] = l.stream().toArray(Integer[]::new);
		//For getting Stream for Array object
		Stream.of(arr).forEach(System.out::println);
//		for(Integer i : arr)
//		{
//			System.out.println(i);
//		}
	}

}
