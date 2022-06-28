package multi_threading;

class MyJoin2 extends Thread{
	public static Thread ct;
	@Override
	public void run() {
		try {
			ct.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<=10; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class Join_02 {

	public static void main(String[] args) {

		MyJoin2 t = new MyJoin2();
		MyJoin2.ct = Thread.currentThread();
		t.start();
		for(int i=0; i<=10; i++)
		{
			System.out.println("Main Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
