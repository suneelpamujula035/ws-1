package collections;

import java.util.Vector;

public class Vector_01 {

	public static void main(String[] args) {

		Vector v = new Vector();
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println(v.capacity());
		v.add(11);
		System.out.println(v.capacity());
	}

}
