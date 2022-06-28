package collections;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_Collections_CHM_01 {

	public static void main(String[] args) {

		ConcurrentHashMap m = new ConcurrentHashMap();
		m.put(101, "durga");
		m.put(101, "ravi");
		System.out.println(m);
		m.putIfAbsent(101, "siva");
		System.out.println(m);
	}

}
