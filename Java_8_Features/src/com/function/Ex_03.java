package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Student2{
	int rollNo;
	String name;
	int marks;
	public Student2(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
}
public class Ex_03 {

	public static void main(String[] args) {

		List<Student2> l = new ArrayList<>();
		l.add(new Student2(1, "Somu", 84));
		l.add(new Student2(2, "Ramu", 56));
		l.add(new Student2(3, "Ravi", 98));
		l.add(new Student2(4, "Raju", 92));
		l.add(new Student2(5, "Rahul", 45));
		l.add(new Student2(6, "Balu", 78));
		l.add(new Student2(7, "Gopi", 28));
		l.add(new Student2(8, "Gopal", 35));
	
	Function<Student2, String> f = s->{
		int marks = s.marks;
		String grade = "";
		if(marks>90) grade="A[Distinction]";
		else if(marks>=60) grade="B[First class]";
		else if(marks>=50) grade="C[Second class]";
		else if(marks>=35) grade="D[Third class]";
		else grade="E[Failed]";
		return grade;
	};
//	Predicate<Student> p = s->s.marks>=60;
//	for(Student stu : l)
//	{
//		if(p.test(stu))
//		{
//			System.out.println(stu.rollNo+" "+stu.name+" "+stu.marks+" "+f.apply(stu));
//		}
//	}
	}

}
