package multi_threading;

class Q{
	int n;
	boolean flag = false;
	public synchronized void consume()
	{
		if(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Got : "+n);
		flag = false;
		notify();
	}
	public synchronized void produce(int n)
	{
		if(flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n = n;
	    flag = true;
	    System.out.println("Put : "+n);
	    notify();
	}
}
class Producer_01 implements Runnable{
	Q q;

	public Producer_01(Q q) {
		super();
		this.q = q;
//		Thread t = new Thread(this);
//		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while(true)
		{
			q.produce(i++);
		}
	}
}
class Consumer_01 implements Runnable{
	Q q;

	public Consumer_01(Q q) {
		super();
		this.q = q;
//		Thread t = new Thread(this);
//		t.start();
	}
	@Override
	public void run() {
		while(true)
		{
			q.consume();
		}
	}
}
public class ProducerConsumerDemo_01 {

	public static void main(String[] args) {

		Q q = new Q();
		Producer_01 p1 = new Producer_01(q);
		Consumer_01 c1 = new Consumer_01(q);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		t1.start();
		t2.start();
	}

}
