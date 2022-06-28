package collections;

import java.util.concurrent.CopyOnWriteArraySet;

public class Concurrent_Collections_COWAS_01 extends Thread {

	//static HashSet l = new HashSet();

	static CopyOnWriteArraySet l = new CopyOnWriteArraySet();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Child thread updating Set object..");
		l.add("D");
	}

	public static void main(String[] args) throws InterruptedException {

		Concurrent_Collections_COWAS_01 t1 = new Concurrent_Collections_COWAS_01();
		l.add("A");
		l.add("B");
		l.add("C");

		t1.start();
		java.util.Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println("Main thread iterating Set object : " + s);
			Thread.sleep(2000);
		}
		System.out.println(l);
	}
}
