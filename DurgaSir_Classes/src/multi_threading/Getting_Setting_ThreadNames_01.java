package multi_threading;
class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class Getting_Setting_ThreadNames_01 {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
		System.out.println(Thread.currentThread().getName());

	}

}
