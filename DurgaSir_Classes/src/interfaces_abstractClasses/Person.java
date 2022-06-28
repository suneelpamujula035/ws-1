package interfaces_abstractClasses;

abstract public class Person {

	private String name;
	private int age;

	public Person(String name, int rollno) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
