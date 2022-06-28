package constructors;

public class Constructors_01 {

	private String name;
	private int age;
	private int rollno;
	private int marks;
	
	public Constructors_01(String name, int age, int rollno, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Constructors_01 [name=" + name + ", age=" + age + ", rollno=" + rollno + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {

		Constructors_01 c = new Constructors_01("suneel", 23, 104, 89);
		System.out.println(c);
	}

}
