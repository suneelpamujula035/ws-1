package com.demo.objectinjection;

public class AnotherStudent {

	private MathsCheat mathsCheat;

	public void setMathsCheat(MathsCheat mathsCheat) {
		this.mathsCheat = mathsCheat;
	}
	
	public void cheating()
	{
		System.out.println("From AnotherStudent class");
		mathsCheat.mathsCheating();
	}
}
