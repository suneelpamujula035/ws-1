package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student{
	int rollNo;
	String name;
	int marks;
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
}
public class Ex_02 {

	public static void main(String[] args) {

		List<Student> l = new ArrayList<>();
		l.add(new Student(1, "Somu", 84));
		l.add(new Student(2, "Ramu", 56));
		l.add(new Student(3, "Ravi", 98));
		l.add(new Student(4, "Raju", 92));
		l.add(new Student(5, "Rahul", 45));
		l.add(new Student(6, "Balu", 78));
		l.add(new Student(7, "Gopi", 28));
		l.add(new Student(8, "Gopal", 35));
	
	Function<Student, String> f = s->{
		int marks = s.marks;
		String grade = "";
		if(marks>90) grade="A[Distinction]";
		else if(marks>=60) grade="B[First class]";
		else if(marks>=50) grade="C[Second class]";
		else if(marks>=35) grade="D[Third class]";
		else grade="E[Failed]";
		return grade;
	};
	for(Student stu : l)
	{
		System.out.println(stu.rollNo+" "+stu.name+" "+stu.marks+" "+f.apply(stu));
	}
}

}
