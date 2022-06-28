package multi_threading;

class SampleThread{
	public synchronized void print(int n) 
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i+n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
class FirstThread extends Thread{
	SampleThread s;
	FirstThread(SampleThread s) {
		this.s = s;
	}
	@Override
	public void run() {
		s.print(10);
	}
}
class SecondThread extends Thread{
	SampleThread s;
	SecondThread(SampleThread s) {
		this.s = s;
	}
	@Override
	public void run() {
		s.print(100);
	}
}
class ThirdThread extends Thread{
	SampleThread s;
	ThirdThread(SampleThread s) {
		this.s = s;
	}
	@Override
	public void run() {
		s.print(1000);
	}
}
public class SynchronizedDemo {

	public static void main(String[] args) {

		SampleThread s = new SampleThread();
		FirstThread t1 = new FirstThread(s);
		SecondThread t2 = new SecondThread(s);
		ThirdThread t3 = new ThirdThread(s);
		t1.start();
		t2.start();
		t3.start();
	}

}
