package method_overloading;

public class Ex_02 {

	public void m1(int i)
	{
		System.out.println("int-arg method");
	}
	public void m1(float f)
	{
		System.out.println("float-arg method");
	}
	public static void main(String[] args) {
		
		Ex_02 e = new Ex_02();
		e.m1(7);
		e.m1(23.58f);
		e.m1('a');
		e.m1(12l);

	}

}
