package multi_threading;

class SharedResources{
	String resource1 = null;
	String resource2 = null;
	public SharedResources(String resource1, String resource2) {
		super();
		this.resource1 = resource1;
		this.resource2 = resource2;
	}
}
class MyThreadClass1 implements Runnable{
	SharedResources sharedResource;
	
	public MyThreadClass1(SharedResources sharedResource) {
		super();
		this.sharedResource = sharedResource;
	}

	@Override
	public void run() {
		synchronized (sharedResource.resource1)
		{
			System.out.println("acquired lock on resource1 by "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("waiting to acquire the lock on resource2 by : "+Thread.currentThread().getName());
			synchronized (sharedResource.resource2)
			{
				System.out.println("acquired lock on resource2");
			}
		}
	}
}
class MyThreadClass2 implements Runnable{
	SharedResources sharedResource;
	
	public MyThreadClass2(SharedResources sharedResource) {
		super();
		this.sharedResource = sharedResource;
	}

	@Override
	public void run() {
		synchronized (sharedResource.resource2)
		{
			System.out.println("acquired lock on resource2 by "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("waiting to acquire the lock on resource1 by : "+Thread.currentThread().getName());
			synchronized (sharedResource.resource1)
			{
				System.out.println("acquired lock on resource1");
			}
		}
	}
}
public class DeadLockDemo {

	public static void main(String[] args) {

		SharedResources sharedResources = new SharedResources("Shared Resource1", "Shared Resource2");
	
		Thread t1 = new Thread(new MyThreadClass1(sharedResources));
		Thread t2 = new Thread(new MyThreadClass2(sharedResources));
		t1.start();
		t2.start();
	}

}
