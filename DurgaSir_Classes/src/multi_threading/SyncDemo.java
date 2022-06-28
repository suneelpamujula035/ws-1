package multi_threading;

class SampleThread22{
	
	public synchronized void print(int n)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i+n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Thread1 extends Thread
{
	SampleThread22 s;

	public Thread1(SampleThread22 s) {
		super();
		this.s = s;
	}
	@Override
	public void run() {
		s.print(10);
	}
}
class Thread2 extends Thread
{
	SampleThread22 s;

	public Thread2(SampleThread22 s) {
		super();
		this.s = s;
	}
	@Override
	public void run() {
		s.print(100);
	}
}
class Thread3 extends Thread
{
	SampleThread22 s;

	public Thread3(SampleThread22 s) {
		super();
		this.s = s;
	}
	@Override
	public void run() {
		s.print(1000);
	}
}
public class SyncDemo {

	public static void main(String[] args) {

		SampleThread22 s = new SampleThread22();
		Thread1 t1 = new Thread1(s);
		Thread2 t2 = new Thread2(s);
		Thread3 t3 = new Thread3(s);
		t1.start();
		t2.start();
		t3.start();
	}

}
