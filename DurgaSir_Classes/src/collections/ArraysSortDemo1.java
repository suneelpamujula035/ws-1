package collections;

import java.util.Arrays;
import java.util.Comparator;
class MyComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
	
}
public class ArraysSortDemo1 {

	public static void main(String[] args) {

		int a[] = {10,5,20,11,6};
		System.out.println("Primitive array before sorting");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("Primitive array after sorting");
		for(int a2:a)
		{
			System.out.println(a2);
		}
	    System.out.println("----------------------------------");
	    String s[] = {"A","Z","B"};
	    System.out.println("Object array before sorting");
	    for(String a3: s)
	    {
	    	System.out.println(a3);
	    }
	    Arrays.sort(s);
	    System.out.println("Object array after sorting");
	    for(String a4:s)
	    {
	    	System.out.println(a4);
	    }
	    Arrays.sort(s, new MyComp());
	    System.out.println("Object array after sorting by comparator");
	    for(String a5:s)
	    {
	    	System.out.println(a5);
	    }
	   
	    
	}

}
