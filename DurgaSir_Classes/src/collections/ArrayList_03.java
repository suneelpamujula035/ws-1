package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_03 {

	public static void main(String[] args) {

		//List<String> l = Arrays.asList("suneel","goutham","mahesh","faizal");
		String names[] = {"suneel","goutham","mahesh","faizal"};
		List<String> l = Arrays.asList(names);
		System.out.println(l);
//		l.add("java");
//		System.out.println(l);
		
		ArrayList<String> l1 = new ArrayList();
		l1.add("one");
		l1.add("two");
		l1.addAll(l);
		System.out.println(l1);
	}

}
