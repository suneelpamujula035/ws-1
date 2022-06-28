package exception_handling;

public class Multiple_catch {

	public static void main(String[] args) {

		try {
			int arr[] = new int[5];
			int a = 5/0;
			String s = null;
			int parseInt = Integer.parseInt("hello");
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch (ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println(aiobe);
		}
		catch(NumberFormatException nf)
		{
			System.out.println(nf);
		}
		catch(NullPointerException np)
		{
			System.out.println(np);
		}
	}

}
