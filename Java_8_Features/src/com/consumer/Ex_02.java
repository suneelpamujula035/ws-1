package com.consumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student5{
	String name;
	int marks;
	public Student5(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}
public class Ex_02 {

	public static void main(String[] args) {
		
		Function<Student5, String> f = s->{//returns any type
			int marks = s.marks;
			String grade = "";
			if(marks>90) grade="A[Distinction]";
			else if(marks>=60) grade="B[First class]";
			else if(marks>=50) grade="C[Second class]";
			else if(marks>=35) grade="D[Third class]";
			else grade="E[Failed]";
			return grade;
		};
		Predicate<Student5> p = s->s.marks>60;//returns boolean
		Consumer<Student5> c = s1->//just for printing purpose
		{
			System.out.println(s1.name+" "+s1.marks+" "+f.apply(s1));
		};
		Student5 s[] = {
				new Student5("Suneel", 98),
				new Student5("Kaamu", 65),
				new Student5("Balu", 45),
				new Student5("Naresh", 25),
				new Student5("Guru", 78),
				new Student5("Girish", 92),
				new Student5("Sahil", 54)
		};
		for(Student5 s1 : s)
		{
			if(p.test(s1))
			{
				c.accept(s1);
			}
		}
	}

}
