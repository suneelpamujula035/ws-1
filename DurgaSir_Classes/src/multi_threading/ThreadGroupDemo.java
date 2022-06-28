package multi_threading;

class GroupDemo implements Runnable{
	@Override
	public void run() {
		System.out.println("Start Thread : "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ended Thread : "+Thread.currentThread().getName());
	}
}
public class ThreadGroupDemo {

	public static void main(String[] args) {
		
		ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");
		GroupDemo g1 = new GroupDemo();
		GroupDemo g2 = new GroupDemo();
		GroupDemo g3 = new GroupDemo();

		Thread t1 = new Thread(threadGroup,g1,"MyRunnable1");
		Thread t2 = new Thread(threadGroup,g2,"MyRunnable2");
		Thread t3 = new Thread(threadGroup,g3,"MyRunnable3");
		t1.start();
		t2.start();
		t3.start();
		//t1.interrupt();
		threadGroup.interrupt();
		int activeCount = threadGroup.activeCount();
		System.out.println(activeCount);
		threadGroup.list();
	}

}
