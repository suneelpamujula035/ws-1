package multi_threading;

class MyInterrupted1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=10; i++)
		{
			System.out.println("Im lzy thread");
		}
		System.out.println("Im entering into sleeping state");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}
public class InterruptDemo_1 {

	public static void main(String[] args) {

		MyInterrupted1 t = new MyInterrupted1();
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
	}

}
