package multi_threading;

class Mythread extends Thread {
	@Override
	public void run() {
		System.out.println("shut down hook task completed..");
	}
}

public class ShutdownDemo {

	public static void main(String[] args) throws InterruptedException {

		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new Mythread());
		System.out.println("Now main sleeping... press ctrl+c to exit");
		Thread.sleep(2000);
	}
}
