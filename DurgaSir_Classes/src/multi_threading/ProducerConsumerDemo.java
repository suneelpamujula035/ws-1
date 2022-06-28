package multi_threading;

import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable{
	List<Integer> sharedList = null;
	final int MAX_SIZE = 5;
	private int i=0;
	
	public Producer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		while(true)
		{
			try {
				produce(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void produce(int i) throws InterruptedException
	{
		synchronized (sharedList)
		{
			while(sharedList.size()==MAX_SIZE)
			{
				System.out.println("SharedList is full....waiting for the consumer to consume");
				sharedList.wait();
			}
		}
		synchronized (sharedList)
		{
			System.out.println("Producer produced element "+i);
			sharedList.add(i);
			Thread.sleep(1000);
			sharedList.notify();
		}
	}
}
class Consumer implements Runnable{
	List<Integer> sharedList = null;
	final int MAX_SIZE = 5;
	
	public Consumer(List<Integer> sharedList) {
		super();
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		while(true)
		{
			try {
				consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void consume() throws InterruptedException
	{
		synchronized (sharedList)
		{
			while(sharedList.size()==MAX_SIZE)
			{
				System.out.println("SharedList is empty....waiting for the producer to produce the object");
				sharedList.wait();
			}
		}
		synchronized (sharedList)
		{
			Thread.sleep(1000);
			System.out.println("Consumed the element "+sharedList.remove(0));
			sharedList.notify();
		}
	}
}
public class ProducerConsumerDemo {

	public static void main(String[] args) {

		List<Integer> sharedList = new ArrayList<>();
		
		Thread thread1 = new Thread(new Producer(sharedList));
		Thread thread2 = new Thread(new Consumer(sharedList));
		thread1.start();
		thread2.start();
		
	}

}
