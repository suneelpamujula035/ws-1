package multi_threading;

class Temp1{
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
class MultiThreading1 implements Runnable{
	Temp1 t;
	
	public MultiThreading1(Temp1 t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		t.print(10);
	}
}

public class Demo_01 {

	public static void main(String[] args) {
		Temp1 t = new Temp1();
		MultiThreading1 m1 = new MultiThreading1(t);
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		Thread t3 = new Thread(m1);
		t1.start();
		t2.start();
		t3.start();
		

	}

}
