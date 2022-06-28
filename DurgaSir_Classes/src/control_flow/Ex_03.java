package control_flow;

public class Ex_03 {

	int i = 10;
	{
		m1();
		System.out.println("First Instance Block");
	}
	Ex_03()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) {

		Ex_03 t = new Ex_03();
		System.out.println("Main");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("Second Instance Block");
	}
	int j = 20;

}
