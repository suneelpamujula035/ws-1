package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_06 {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();
		marks.add(55);
		marks.add(5);
		marks.add(70);
		marks.add(35);
		marks.add(25);
		marks.add(15);
		marks.add(45);
		marks.add(60);
		
		System.out.println(marks);
		List<Integer> sortedMarks = marks.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		System.out.println("Sorted Marks in Descending Order : "+sortedMarks);
	}

}
