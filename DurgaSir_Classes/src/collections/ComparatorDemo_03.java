package collections;

import java.util.Comparator;
import java.util.TreeSet;

class My_Comparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1<l2)
		{
			return -1;
		}
		else if(l1>l2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
public class ComparatorDemo_03 {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new My_Comparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}

}
