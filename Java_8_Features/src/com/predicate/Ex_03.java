package com.predicate;

import java.util.function.Predicate;

public class Ex_03 {

	public static void main(String[] args) {

		int arr[] = {5,10,15,20,25,30,35,40,45,50};
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>10;
		System.out.println("The numbers which are > 10 and even : ");
		for(int i1 : arr)
		{
			if(p1.and(p2).test(i1))
			{
				System.out.println(i1);
			}
		}
		System.out.println("The numbers which are > 10 or even : ");
		for(int i1 : arr)
		{
			if(p1.or(p2).test(i1))
			{
				System.out.println(i1);
			}
		}
		System.out.println("The numbers which are not even : ");
		for(int i1 : arr)
		{
			if(p1.negate().test(i1))
			{
				System.out.println(i1);
			}
		}
	}

}
