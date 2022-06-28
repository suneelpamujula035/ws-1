package multi_threading;

class MyInterrupt extends Thread{
	@Override
	public void run() {
		try {
			for(int i=0; i<=10; i++)
			{
				System.out.println("I'am Lazy Thread");
			}
		}
		catch(Exception e)
		{
			System.out.println("I got Interrupted");
		}
	}
}
public class InterruptDemo {

	public static void main(String[] args) {
		
		MyInterrupt t = new MyInterrupt();
		t.start();
		t.interrupt();
		System.out.println("End of Main method");

	}

}
