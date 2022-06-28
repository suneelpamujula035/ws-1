package method_overloading;

public class Ex_06 {

	public void m1(int i)
	{
		System.out.println("general method");
	}
	public void m1(int...x)
	{
		System.out.println("var-arg method");
	}
	public static void main(String[] args) {
		
		Ex_06 e = new Ex_06();
		e.m1();
		e.m1(24);
		e.m1(12,78,93,78);

	}

}
