package collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_01 {

	public static void main(String[] args) {

		Vector v = new Vector();
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println(v);
		Enumeration elements = v.elements();
		while(elements.hasMoreElements())
		{
			Integer i = (Integer) elements.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
	}

}
