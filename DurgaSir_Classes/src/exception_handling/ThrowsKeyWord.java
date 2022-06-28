package exception_handling;

public class ThrowsKeyWord {

//	public static void doStuff() throws InterruptedException
//	{
//		doMoreStuff();
//	}
//	public static void doMoreStuff() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		System.out.println("Hello world");
//	}
//	public static void main(String[] args) throws InterruptedException {
//
//		doStuff();
//	}
	
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello world");
	}
	public static void main(String[] args) {

		doStuff();
	}

}
