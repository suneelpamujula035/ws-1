package exception_handling;

public class Try_finally {

	public static void main(String[] args) {

		try {
			int arr[] = new int [4];
			System.out.println(arr[7]);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I'm from finally block");
		}
	}

}
