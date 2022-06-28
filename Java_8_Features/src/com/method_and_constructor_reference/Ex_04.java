package com.method_and_constructor_reference;

class Student{
	int rollno;
	String name;
	int marks;
	int age;
	public Student(int rollno, String name, int marks, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	
}
interface Interf2{
	public Student get(int rollno, String name, int marks, int age);
}
public class Ex_04 {

	public static void main(String[] args) {

		Interf2 i = (rollno,name,marks,age)-> new Student(rollno, name, marks, age);
		Interf2 i1 = Student::new;
	}

}
