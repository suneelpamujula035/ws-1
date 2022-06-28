package exception_handling;

public class Arithmetic_Exception_01 {

//	public static void main(String[] args) {
//
//		int a = 15;
//		int b = 0;
//		int c = 0;
//		try
//		{
//			c = a/b;
//		}
//		catch(Exception e)
//		{
//			System.out.println(e+" "+c);
//		}
//		System.out.println(c);
//		System.out.println("Good evening");
//	}
	public static void main(String[] args) {

		int a = 15;
		int b = 3;
		int c = 0;
		try
		{
			c = a/b;
		}
		catch(Exception e)
		{
			System.out.println(e+" "+c);
		}
		System.out.println(c);
		System.out.println("Good evening");
	}

}
