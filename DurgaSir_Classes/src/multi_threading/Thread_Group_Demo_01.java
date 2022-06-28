package multi_threading;

class GroupDemo_01 implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName()+"\t"+" i = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Thread_Group_Demo_01 {

	public static void main(String[] args) {

		ThreadGroup groupA = new ThreadGroup("groupA");
		ThreadGroup groupB = new ThreadGroup("groupB");
		ThreadGroup groupC = new ThreadGroup("groupC");
		
		GroupDemo_01 r = new GroupDemo_01();
		Thread t1 = new Thread(groupA,r,"T1");
		Thread t2 = new Thread(groupA,r,"T2");
		Thread t3 = new Thread(groupA,r,"T3");
		Thread t4 = new Thread(groupA,r,"T4");
		Thread t5 = new Thread(groupA,r,"T5");
		
		Thread t6 = new Thread(groupB,r,"T6");
		Thread t7 = new Thread(groupB,r,"T7");
		Thread t8 = new Thread(groupB,r,"T8");
		
		Thread t9 = new Thread(groupC,r,"T9");
		Thread t10 = new Thread(groupC,r,"T10");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		groupC.list();
		System.out.println(groupB.activeCount());
		System.out.println(groupC.activeCount());
		groupA.setMaxPriority(Thread.MAX_PRIORITY);
	}

}
