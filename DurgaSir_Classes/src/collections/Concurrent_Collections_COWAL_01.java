package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrent_Collections_COWAL_01 extends Thread {

//	static ArrayList l = new ArrayList();
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Child thread updating list object..");
		l.add("D");
	}
	public static void main(String[] args) throws InterruptedException {

		Concurrent_Collections_COWAL_01 t1 = new Concurrent_Collections_COWAL_01();
		l.add("A");
		l.add("B");
		l.add("C");
		
		t1.start();
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println("Main thread iterating list object : "+s);
			Thread.sleep(2000);
		}
		System.out.println(l);
	}

}
