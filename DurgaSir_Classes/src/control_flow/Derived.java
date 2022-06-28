package control_flow;

class Base{
	static int i = 10;
	static {
		m1();
		System.out.println("Base Static Block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("Base main");
	}
	public static void m1()
	{
		m1();
		System.out.println(j);
	}
	static int j = 20;
}
public class Derived extends Base{

	static int x = 100;
	static {
		m2();
		System.out.println("Derived First Static Block");
	}
	public static void main(String[] args) {

		m2();
		System.out.println("Derived main");
	}
	public static void m2()
	{
		m2();
		System.out.println(y);
	}
	static {
		System.out.println("Derived Second Static Block");
	}
	static int y = 200;

}
