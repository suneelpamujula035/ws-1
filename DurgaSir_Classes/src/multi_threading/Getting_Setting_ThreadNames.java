package multi_threading;

public class Getting_Setting_ThreadNames extends Thread{

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());//main
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		Thread t2 = new Thread();
		System.out.println(t2.getName());
		Thread t3 = new Thread();
		System.out.println(t3.getName());
		Thread t4 = new Thread();
		t4.setName("t4-thread");
		System.out.println(t4.getName());
		Thread.currentThread().setName("suneel pamujula");
		System.out.println(Thread.currentThread().getName());//suneel pamujula
	}

}
