package interfaces_abstractClasses;

class Student extends Person {
	private int rollno;
	private int marks;
	private char grade;
	private char section;

	public Student(String name, int age, int rollno, int marks, char grade, char section) {
		super(name, age);
		this.rollno = rollno;
		this.marks = marks;
		this.grade = grade;
		this.section = section;
	}

	public static void main(String[] args) {
		Student s = new Student("suneel", 24, 104, 98, 'A', 'C');
		System.out.println(s);
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", grade=" + grade + ", section=" + section + "]";
	}
}
