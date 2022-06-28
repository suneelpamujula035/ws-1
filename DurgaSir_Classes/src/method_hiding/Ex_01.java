package method_hiding;

class Parent{
	public static void m1()
	{
		System.out.println("parent-method");
	}
}
class Child extends Parent{
	public static void m1()
	{
		System.out.println("child-method");
	}
}
public class Ex_01 {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.m1();
		
		Child c = new Child();
		c.m1();
		
		Parent pp = new Child();
		pp.m1();
		
	}

}
