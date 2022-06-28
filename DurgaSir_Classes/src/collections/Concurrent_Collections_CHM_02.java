package collections;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_Collections_CHM_02 {

	public static void main(String[] args) {

		ConcurrentHashMap m = new ConcurrentHashMap();
		m.put(101, "durga");
		m.remove(101, "ravi");
		System.out.println(m);
		m.remove(101,"durga");
		System.out.println(m);
	}

}
