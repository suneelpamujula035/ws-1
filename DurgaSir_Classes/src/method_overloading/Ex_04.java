package method_overloading;

public class Ex_04 {

	public void m1(String s)
	{
		System.out.println("String-version");
	}
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer-version");
	}
	public static void main(String[] args) {

		Ex_04 e = new Ex_04();
		e.m1("suneel");
		e.m1(new StringBuffer("hai"));
		//e.m1(null);
	}

}
