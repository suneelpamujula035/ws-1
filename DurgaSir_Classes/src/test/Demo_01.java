package test;

public class Demo_01 {

	static int i = 5999;
	public void m1()
	{
		System.out.println(i);
	}
	public static void m2()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {

		int x = 12;
		System.out.println(x);
		Demo_01 d = new Demo_01();
		d.m1();
		d.m2();
	}

}
