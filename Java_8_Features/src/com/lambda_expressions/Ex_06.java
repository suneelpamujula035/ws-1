package com.lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	public static final String Collections = null;
	int id;
	String name;
	String country;
	public Employee(int id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
}
public class Ex_06 {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();
		l.add(new Employee(118, "Santhosh", "Uganda"));
		l.add(new Employee(107, "Basheer", "Mumbai"));
		l.add(new Employee(101, "Vivek", "UK"));
		l.add(new Employee(132, "Narendra", "California"));
		l.add(new Employee(109, "Naveen", "India"));
		l.add(new Employee(103, "Fahim", "US"));
		System.out.println("Before sorting");
		System.out.println(l);
		//Sorting based on Employee Id
		//Collections.sort(l, (e1,e2)->(e1.id<e2.id)?-1:(e1.id<e2.id)?1:0);
		//Sorting based on Employee name (Default natural sorting order - Comparable)
		Collections.sort(l, (e1, e2)-> e1.name.compareTo(e2.name));
		System.out.println("After sorting");
//		System.out.println(l);
//		l.stream().forEach(System.out::println);
//		List<Employee> l2 = l.stream().filter(e->e.id%2==0).collect(Collectors.toList());
//		System.out.println(l2);
		l.stream().forEach(System.out::println);
	}

}
