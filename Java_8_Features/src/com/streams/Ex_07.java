package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_07 {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("Sunny Leone");
		l.add("Prabhas");
		l.add("Anushka Shetty");
		l.add("Kajal Agarwal");
		l.add("Mallika Sharavath");
		System.out.println(l);
//		Comparator<String> c = (s1,s2)->{
//			int l1 = s1.length();
//			int l2 = s2.length();
//			if(l1<l2) return 1;
//			else if(l1>l2) return -1;
//			else return s1.compareTo(s2);
//		};
//		List<String> list = l.stream().sorted().collect(Collectors.toList());
		List<String> list = l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(list);

	}

}
