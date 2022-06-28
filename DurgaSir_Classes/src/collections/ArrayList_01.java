package collections;

import java.util.ArrayList;

public class ArrayList_01 {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("B");
		l.add(null);
		l.add('C');
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "Hiiii");
		l.add("N");
		System.out.println(l);
	}

}

