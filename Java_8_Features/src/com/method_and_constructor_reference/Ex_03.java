package com.method_and_constructor_reference;

class Sample1{
	Sample1(String s)
	{
		System.out.println("Sample class constructor execution with argument : "+s);
	}
}
interface Interf1{
	public Sample1 get(String s);
}
public class Ex_03 {

	public static void main(String[] args) {

		Interf1 i = Sample1::new;
		Sample1 s1 = i.get("Suneel");
		Sample1 s2 = i.get("Sandeep");
		Sample1 s3 = i.get("Hareesh");
		Sample1 s4 = i.get("Pawan");
	}

}
