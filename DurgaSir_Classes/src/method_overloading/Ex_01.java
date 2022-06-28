package method_overloading;

public class Ex_01 {

	public void m1()
	{
		System.out.println("no-arg method");
	}
	public void m1(int i)
	{
		System.out.println("int-arg method");
	}
	public void m1(double d)
	{
		System.out.println("double-arg method");
	}
	public static void main(String[] args) {

		Ex_01 e = new Ex_01();
		e.m1();
		e.m1(6);
		e.m1(89.12);
	}

}
