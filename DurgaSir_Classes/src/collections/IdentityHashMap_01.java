package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMap_01 {

	public static void main(String[] args) {

		IdentityHashMap m = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "pawan");
		m.put(i2, "kalyan");
		System.out.println(m);
	}

}
