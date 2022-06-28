package multi_threading;

class Sample11 {
	public synchronized static void print(int n) {
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println(n + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}

	}
}

class FirstThread11 extends Thread {
	@Override
	public void run() {
		Sample11.print(10);
	}
}

class SecondThread11 extends Thread {
	@Override
	public void run() {
		Sample11.print(100);
	}
}

class ThirdThread11 extends Thread {
	@Override
	public void run() {
		Sample11.print(1000);
	}
}

public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		FirstThread11 t1 = new FirstThread11();
		SecondThread11 t2 = new SecondThread11();
		ThirdThread11 t3 = new ThirdThread11();
		t1.start();
		t2.start();
		t3.start();
	}
}
