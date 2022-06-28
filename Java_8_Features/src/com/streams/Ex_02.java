package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_02 {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<>();
		marks.add(5);
		marks.add(15);
		marks.add(25);
		marks.add(35);
		marks.add(45);
		marks.add(55);
		marks.add(60);
		marks.add(70);
		System.out.println(marks);
		List<Integer> updatedMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
	}

}
