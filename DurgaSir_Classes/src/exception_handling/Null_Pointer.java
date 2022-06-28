package exception_handling;

public class Null_Pointer {

	public static void main(String[] args) {

		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Program executed");
	}

}
