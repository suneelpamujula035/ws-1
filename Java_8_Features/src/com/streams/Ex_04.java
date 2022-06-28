package com.streams;

import java.util.ArrayList;
import java.util.List;

public class Ex_04 {

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
		long failedStudents = marks.stream().filter(m->m<35).count();
		System.out.println("Failed Students : "+failedStudents);
	}

}
