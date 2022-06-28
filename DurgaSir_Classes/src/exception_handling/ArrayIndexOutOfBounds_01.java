package exception_handling;

public class ArrayIndexOutOfBounds_01 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		
		try {
			System.out.println(arr[8]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("program executed");
	}

}
