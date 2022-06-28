package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_01 {

	public static void main(String[] args) {

		HashMap m = new HashMap();
		m.put("chiranjeevi", 700);
		m.put("balakrishna", 00);
		m.put("venkatesh", 200);
		m.put("nagrjuna", 500);
		System.out.println(m);
		System.out.println(m.put("chiranjeevi", 1000));
		Set keySet = m.keySet();
		System.out.println(keySet);
		System.out.println("-------------------------------");
		Collection values = m.values();
		System.out.println(values);
		System.out.println("-------------------------------");
		Set entrySet = m.entrySet();
		System.out.println(entrySet);
		System.out.println("-------------------------------");
		Iterator itr = entrySet.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"----"+m1.getValue());
			if(m1.getKey().equals(1000))
			{
				m1.setValue(10000);
			}
		}
		System.out.println(m);
	}

}
