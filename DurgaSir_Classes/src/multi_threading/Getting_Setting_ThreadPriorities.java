package multi_threading;

class MyPriority extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class Getting_Setting_ThreadPriorities {

	public static void main(String[] args) {

		MyPriority t = new MyPriority();
//		t.setPriority(Thread.MAX_PRIORITY);
//		t.setPriority(Thread.MIN_PRIORITY);
		t.setPriority(10);
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread");
			//System.out.println(Thread.currentThread().getPriority());//For main Thread by default priority is 5
		}
	}

}
