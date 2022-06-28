package collections;

import java.util.HashSet;

public class HashSet_01 {

	public static void main(String[] args) {

		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);//accepts only one time
		h.add(10);
		h.add(null);
		System.out.println(h.add("Z"));
		
		System.out.println(h);
	}

}
