package method_overriding;

class Parent{
	public void property()
	{
		System.out.println("Cash+Golad+Land");
	}
	public void marriage()
	{
		System.out.println("Appalamma");
	}
}
class Child extends Parent{
	public void marriage()
	{
		System.out.println("Alia Bhat");
	}
}
public class Ex_01 {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.property();
		p.marriage();
		System.out.println("--------------------------");
		Child c = new Child();
		c.property();
		c.marriage();
		System.out.println("--------------------------");
		Parent pp = new Child();
		pp.property();
		pp.marriage();
	}

}
