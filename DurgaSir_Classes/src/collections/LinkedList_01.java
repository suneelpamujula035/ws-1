package collections;

import java.util.LinkedList;

public class LinkedList_01 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		l.set(0, "software");
		l.add(0,"venkey");
		l.removeLast();
		l.addFirst("CCC");
		l.addFirst(l);
		System.out.println(l);
	}

}
