package com.predicate;

import java.util.function.Predicate;

public class Ex_01 {

	public static void main(String[] args) {

		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(20));
		System.out.println(p.test(25));
		
		Predicate<String> s = i->i.length()>5;//true or false
		System.out.println(s.test("Hello world"));
		
		String arr[] = {"Karthik","Anil","Balu","Sathwik","Sandeep","Ganesh","Srinu","Vino"};
		Predicate<String> p1 = str->str.length()>5;
		for(String s1 : arr)
		{
			if(p1.test(s1))
			{
				System.out.println(s1);
			}
		}
	}

}
