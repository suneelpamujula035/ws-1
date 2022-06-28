package control_flow;

public class Ex_02 {

	static int i = 10;
	static {
		m1();
		System.out.println(i);
	}
	public static void m1()
	{
		System.out.println(i+" from method");
	}
	public static void main(String[] args) {

		m1();
	}

}
