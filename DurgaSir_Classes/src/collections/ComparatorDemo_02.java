package collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator_02 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
	
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}
}
public class ComparatorDemo_02 {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparator_02());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}

}
