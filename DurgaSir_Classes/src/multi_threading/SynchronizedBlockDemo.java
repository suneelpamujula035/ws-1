package multi_threading;

class Sample1{
	public void print(int n)
	{
		synchronized (this)
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println(n+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
			}
		}
	}
}
class FirstThread1 extends Thread{
	Sample1 s;
	FirstThread1(Sample1 s)
	{
		this.s = s;
	}
	@Override
	public void run() {
		s.print(10);
	}
}
class SecondThread1 extends Thread{
	Sample1 s;
	SecondThread1(Sample1 s)
	{
		this.s = s;
	}
	@Override
	public void run() {
		s.print(100);
	}
}
class ThirdThread1 extends Thread{
	Sample1 s;
	ThirdThread1(Sample1 s)
	{
		this.s = s;
	}
	@Override
	public void run() {
		s.print(1000);
	}
}
public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		Sample1 s  = new Sample1();
		FirstThread1 t1 = new FirstThread1(s);
		SecondThread1 t2 = new SecondThread1(s);
		ThirdThread1 t3 = new ThirdThread1(s);
		t1.start();
		t2.start();
		t3.start();
	}
}
