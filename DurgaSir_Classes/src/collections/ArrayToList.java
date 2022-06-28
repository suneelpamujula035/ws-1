package collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {

		String s[] = {"A","Z","B"};
		List<String> l = Arrays.asList(s);
		s[0] = "K";
		System.out.println(l);
		l.set(1, "L");
		for(String s1 : s)
		{
			System.out.println(s1);
		}
		//l.add("durga");
		//System.out.println(l);
	}

}
