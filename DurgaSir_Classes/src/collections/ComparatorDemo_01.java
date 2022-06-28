package collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator_01 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = (String)o1;
		String s2 = (String)o2;
		return -s1.compareTo(s2);
	}
}
public class ComparatorDemo_01 {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparator_01());
		t.add("Roja");
		t.add("Sobharani");
		t.add("Rajakumari");
		t.add("Gangabhavani");
		t.add("Raamulamma");
		System.out.println(t);
	}

}
