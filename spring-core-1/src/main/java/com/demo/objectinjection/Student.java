package com.demo.objectinjection;

public class Student {

	private int id;
	private MathsCheat mathsCheat;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMathsCheat(MathsCheat mathsCheat) {
		this.mathsCheat = mathsCheat;
	}
	
	public void cheat()
	{
		mathsCheat.mathsCheating();
		System.out.println("This is my id : "+id);
	}
}
