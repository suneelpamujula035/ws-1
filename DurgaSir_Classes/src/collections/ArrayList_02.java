package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_02 {

	public static void main(String[] args) {

		ArrayList l = new ArrayList<>();
		l.add(10);
		l.add(20);
		List l1 = Collections.synchronizedList(l);
		System.out.println(l1);
		
	}

}
