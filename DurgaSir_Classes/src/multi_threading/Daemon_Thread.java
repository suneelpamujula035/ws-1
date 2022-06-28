package multi_threading;

public class Daemon_Thread extends Thread{
	@Override
	public void run() {

		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread works --  "+Thread.currentThread().getName());
		}
		else
		{
			System.out.println("User Thread works --  "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		Daemon_Thread t1 = new Daemon_Thread();
		Daemon_Thread t2 = new Daemon_Thread();
		Daemon_Thread t3 = new Daemon_Thread();
		Daemon_Thread t4 = new Daemon_Thread();
		Daemon_Thread t5 = new Daemon_Thread();
		t1.setDaemon(true);
		t4.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
