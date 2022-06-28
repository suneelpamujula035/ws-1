package method_overloading;

public class Ex_05 {

	public void m1(int i, float f)
	{
		System.out.println("int-float version");
	}
	public void m1(float f, int i)
	{
		System.out.println("float-int version");
	}
	public static void main(String[] args) {

		Ex_05 e = new Ex_05();
		e.m1(23, 10.5f);
		e.m1(23.6f, 78);
		//e.m1(23, 12);
		//e.m1(12.7f, 12.9f);
	}

}
