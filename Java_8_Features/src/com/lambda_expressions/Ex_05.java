package com.lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class MyComparator implements Comparator<Integer> {
//
//	@Override//For desecnding order
//	public int compare(Integer i1, Integer i2) {
//		return (i1>i2)?-1:(i1<i2)?1:0;
//		if (i1 > i2)
//			return -1;
//		else if (i1 < i2)
//			return 1;
//		else
//			return 0;
//	}
//
//}

public class Ex_05 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(30);
		l.add(0);
		l.add(15);
		System.out.println("Before sorting : ");
		System.out.println(l);
		Comparator<Integer> c = (i1, i2) ->(i1>i2)?-1:(i1<i2)?1:0;
		Collections.sort(l, c);
		//Collections.sort(l, new MyComparator());
		System.out.println("After sorting : ");
		//System.out.println(l);
		//l.forEach((y)->System.out.println(y));
		//l.stream().forEach(System.out::println);
		
		//For finding only even numbers from the list
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}
}
