package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
public class Ex_02 {

	public static void main(String[] args) {

		List<Student> l = new ArrayList<>();
		l.add(new Student(1, "Dev", 93));
		l.add(new Student(2, "Vikas", 89));
		l.add(new Student(3, "Raj", 97));
		l.add(new Student(4, "Teja", 65));
		l.add(new Student(5, "Harsha", 94));
		l.add(new Student(6, "Vishnu", 70));
		l.add(new Student(7, "Ravi", 54));
		
		//Predicate<Student> p = s->s.marks>90;
//		for(Student stu : l)
//		{
//			if(p.test(stu))
//			{
//				System.out.println(stu.id+" "+stu.name+" "+stu.marks);
//			}
//		}
		List<Student> l2 = l.stream().filter(s->s.marks>60).collect(Collectors.toList());
		System.out.println(l2);
	}
}
