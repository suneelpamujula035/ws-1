package control_flow;

public class WithoutMainMethod {

//	static {
//		System.out.println("Hello I can print");
//		System.exit(0);
//	}
	
//	static int x = m1();
//	public static int m1()
//	{
//		System.out.println("Hello I can print");
//		System.exit(0);
//		return 0;
//	}
	
//	static WithoutMainMethod t = new WithoutMainMethod();
//	{
//		System.out.println("Hello I can print");
//		System.exit(0);
//	}
	
	static WithoutMainMethod t = new WithoutMainMethod();
	WithoutMainMethod(){
		System.out.println("Hello I can print");
		System.exit(0);
	}
}
