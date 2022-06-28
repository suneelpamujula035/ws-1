package multi_threading;

class MyYield extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=10; i++)
		{
			System.out.println("Child Thread");
			Thread.yield();//To pause the current thread and giving chance to the same priority of waiting threads
		}
	}
}
public class Yeild_01 {

	public static void main(String[] args) {
		MyYield t = new MyYield();
		t.start();
		for(int i=0; i<=10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}
