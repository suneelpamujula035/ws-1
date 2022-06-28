package multi_threading;

class Temp{
	public synchronized void print(int n)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i+n+" ----  "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MultiThreading extends Thread{
	Temp t;
	
	public MultiThreading(Temp t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		t.print(10);
	}
}

public class Demo {

	public static void main(String[] args) {
		Temp t = new Temp();
		MultiThreading t1 = new MultiThreading(t);
		MultiThreading t2 = new MultiThreading(t);
		MultiThreading t3 = new MultiThreading(t);
		t1.start();
		t2.start();
		t3.start();

	}

}
