package collections;

import java.util.TreeSet;

public class TreeSet_01 {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		//t.add(new Integer(10));
		//t.add(null);
		System.out.println(t);
	}
}
