package multi_threading;

class Thread_B extends Thread{
	@Override
	public void run() {
		int total = 0;
		synchronized (this) {
			System.out.println("Child thread calls calculation");
			for(int i=0; i<10; i++)
			{
				total = total + i;
			}
			System.out.println("Child thread giving notification");
			this.notify();
		}
	}
}
public class WaitDemo {

	public static void main(String[] args) {

		Thread_B b = new Thread_B();
		b.start();
		synchronized (b) {
			System.out.println("Main thread calling wait method");
			//b.wait();
			System.out.println("Main thread got notification");
//			System.out.println(b.total);
		}
	}

}
