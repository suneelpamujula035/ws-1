package exception_handling;

public class MultiCatchBlock {

	public static void main(String[] args) {

		try {
			String s = null;//Whatever we place first line of code will be go to exception
			System.out.println(s.length());
			int a = 5/0;
		}
		catch(ArithmeticException | NullPointerException  e)
		{
			e.printStackTrace();
		}
	}

}
