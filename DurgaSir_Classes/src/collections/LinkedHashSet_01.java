package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet_01 {

	public static void main(String[] args) {

		LinkedHashSet h = new LinkedHashSet();
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
