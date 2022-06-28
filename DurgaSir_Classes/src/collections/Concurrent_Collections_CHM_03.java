package collections;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_Collections_CHM_03 {

	public static void main(String[] args) {

		ConcurrentHashMap m = new ConcurrentHashMap();
		m.put(101, "durga");
		m.replace(101, "ravi","siva");
		System.out.println(m);
		m.replace(101, "durga","vishnu");
		System.out.println(m);
	}

}
