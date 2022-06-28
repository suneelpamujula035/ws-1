package com.streams;

import java.util.ArrayList;
import java.util.List;

public class Ex_08 {

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
		Integer minValue = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum value : "+minValue);
		Integer maxValue = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Maxium value : "+maxValue);
	}

}
