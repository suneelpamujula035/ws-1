package com.lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

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
		
		l.stream().forEach(System.out::println);
	}
}
