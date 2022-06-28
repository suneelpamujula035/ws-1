package test;

class Person {
	private String name;
	private int age;
	private int marks;
	private static String collegeName = "ASIT";

	public Person(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void show()
	{
		System.out.println(name+"--"+age+"--"+marks+"--"+collegeName);
	}

}

public class Test {

	public static void main(String[] args) {

		Person pp = new Person("sunny", 29, 75);
		pp.show();
	}

	

}
