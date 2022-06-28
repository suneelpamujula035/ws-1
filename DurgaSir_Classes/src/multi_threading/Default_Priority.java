package multi_threading;

class MyDefaultPriority extends Thread{
	
}
public class Default_Priority {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getPriority());//For main Thread by default priority is 5
		Thread.currentThread().setPriority(8);
		MyDefaultPriority t = new MyDefaultPriority();
		//t.setPriority(3);
		System.out.println(t.getPriority());//Default priority inherited to all threads
	}

}
