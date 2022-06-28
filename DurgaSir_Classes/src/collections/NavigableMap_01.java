package collections;

import java.util.TreeMap;

public class NavigableMap_01 {

	public static void main(String[] args) {

		TreeMap<String, String> t = new TreeMap();
		t.put("b", "banana");
		t.put("c", "cat");
		t.put("a", "apple");
		t.put("d", "dog");
		t.put("g", "gun");
		System.out.println(t);
		System.out.println(t.ceilingKey("c"));
		System.out.println(t.higherKey("e"));
		System.out.println(t.lowerKey(" "));
		System.out.println(t.floorKey("e"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());
		System.out.println(t);
		
	}

}
