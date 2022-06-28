package com.method_and_constructor_reference;

class Sample{
	Sample()
	{
		System.out.println("Sample class constructor execution");
	}
}
interface Interf{
	public Sample get();
}
public class Ex_02 {

	public static void main(String[] args) {

		Interf i = Sample::new;
		Sample s1 = i.get();
		Sample s2 = i.get();
		Sample s3 = i.get();
		Sample s4 = i.get();
	}

}
