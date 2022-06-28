package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if(i1<i2)
		{
			return -1;
		}
		else if(i1>i2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {

//		List<Student> l = new ArrayList(new MyComparator());
//		l.add(new Student(101,"suneel",24));
//		l.add(new Student(102,"ganesh",22));
//		l.add(new Student(103,"aadi",35));
//		l.add(new Student(104,"guru",76));
//		l.add(new Student(105,"balu",47));
//		
//		for(Student x : l)
//		{
//			System.out.println(x.name);
//		}
	}

}
