package com.predicate;

import java.util.function.IntPredicate;

public class Ex_05 {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9};
		IntPredicate p = i->i%2==0;
		for(int x:arr)
		{
			if(p.test(x))
			{
				System.out.println(x);
			}
		}
	}

}
