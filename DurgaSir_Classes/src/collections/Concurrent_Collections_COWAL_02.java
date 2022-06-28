package collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrent_Collections_COWAL_02 {

	public static void main(String[] args) {

		CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		l.add("A");
		l.add("A");
		System.out.println(l);
		l.addIfAbsent("B");
		System.out.println(l);
		l.addIfAbsent("B");
		System.out.println(l);
	}

}
