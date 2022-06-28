package exception_handling;

public class Number_Format {
	public static void main(String[] args) {

		try {
			int parseInt = Integer.parseInt("Hi");
			System.out.println(parseInt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Program executed");
	}

}
