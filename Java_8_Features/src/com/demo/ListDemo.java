package com.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(78);
		l.add(65);
		l.add(45);
		l.add(23);
		l.add(56);
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println("--------------------");
		for(int i=0; i<=l.size()-1; i++)
		{
			System.out.println(l.get(i));
		}
	}

}
