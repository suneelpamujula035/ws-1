package collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	int rollno;
	String name;
	int age;

	Employee(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Employee st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

public class ComparableDemo_01 {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Vijay", 23));
		al.add(new Employee(106, "Ajay", 27));
		al.add(new Employee(105, "Jai", 21));

		Collections.sort(al);
		for (Employee st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}
