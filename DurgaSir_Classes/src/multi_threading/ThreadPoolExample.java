package multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	private int num;
	public WorkerThread(int num) {
		super();
		this.num = num;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" (Start) num = "+num);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" (End) ");
	}
}
public class ThreadPoolExample {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=1; i<=10; i++)
		{
			Runnable worker = new WorkerThread(i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated())
		{
			
		}
		System.out.println("Finished all Threads");
	}

}
