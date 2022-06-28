package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_01 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(12);
		l.add(15);
		l.add(9);
		l.add(17);
		l.add(23);
		l.add(18);
		l.add(4);
		//l.forEach(i->System.out.println(i));
		System.out.println(l);
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
