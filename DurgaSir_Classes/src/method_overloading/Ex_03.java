package method_overloading;

public class Ex_03 {

	public void m1(String s)
	{
		System.out.println("String-version");
	}
	public void m1(Object o)
	{
		System.out.println("Object-version");
	}
	public static void main(String[] args) {

		Ex_03 e = new Ex_03();
		e.m1("suneel");
		e.m1(new Object());
		e.m1(null);
	}

}
