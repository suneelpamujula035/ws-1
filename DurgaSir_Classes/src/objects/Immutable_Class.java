package objects;

public final class Immutable_Class {

	private int id;
	private String name;
	private int age;
	
	public Immutable_Class(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {

		Immutable_Class i1 = new Immutable_Class(1, "suneel", 23);System.out.println(i1.hashCode());
		Immutable_Class i2 = new Immutable_Class(1, "suneel", 23);System.out.println(i2.hashCode());
		Immutable_Class i3 = new Immutable_Class(2, "praveen", 24);System.out.println(i3.hashCode());
		Immutable_Class i4 = new Immutable_Class(3, "harsha", 34);System.out.println(i4.hashCode());
	}

}
