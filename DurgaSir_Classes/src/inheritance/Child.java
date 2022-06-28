package inheritance;

class Parent{
	public void m1()
	{
		System.out.println("Parent method");
	}
}
public class Child extends Parent {

	public void m2()
	{
		System.out.println("Child method");
	}
	public static void main(String[] args) {

		Parent p = new Parent();
		p.m1();
		System.out.println("-------------------------------");
		Child c = new Child();
		c.m1();
		c.m2();
		System.out.println("-------------------------------");
		Parent p1 = new Child();
		p1.m1();
	}

}
