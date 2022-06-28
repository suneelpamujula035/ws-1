package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Employee{
	int eno;
	String name;
	public Employee(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
}
public class Ex_05 {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(1, "Krishna"));
		l.add(new Employee(2, "Srujan"));
		l.add(new Employee(3, "Jashwanth"));
		l.add(new Employee(4, "Guru"));
		l.add(new Employee(5, "Ramesh"));
		BiFunction<Integer, String, Employee> f = (eno,name)-> new Employee(eno, name);
		for(Employee e1 : l)
		{
			System.out.println(e1.eno+" "+e1.name);
		}
		
	}

}
