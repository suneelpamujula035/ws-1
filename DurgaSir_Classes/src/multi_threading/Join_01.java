package multi_threading;

class MyJoin extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=10; i++)
		{
			System.out.println("Seeta Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Join_01 {

	public static void main(String[] args) throws InterruptedException {

		MyJoin t = new MyJoin();
		t.start();
		t.join();
		for(int i=0; i<=10; i++)
		{
			System.out.println("Rama Thread");
		}
	}

}
