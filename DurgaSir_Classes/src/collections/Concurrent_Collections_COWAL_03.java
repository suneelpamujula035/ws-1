package collections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrent_Collections_COWAL_03 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");

		CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
		l1.add("A");
		l1.add("c");
		System.out.println(l1);
		l1.addAll(l);
		System.out.println(l1);
		
		ArrayList l2 = new ArrayList();
		l2.add("A");
		l2.add("D");
		l1.addAllAbsent(l2);
		System.out.println(l1);
	}

}
