package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User{
	int id;
	String name;
	int age;
	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		User u1 = (User)o1;
		User u2 = (User)o2;
		if(u1.age>u2.age)
			return 1;
		else if(u1.age<u2.age)
			return -1;
		else
			return 0;
	}
	
}
class NameComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		User u1 = (User)o1;
		User u2 = (User)o2;
		return u1.name.compareTo(u2.name);
	}
}
public class ComparatorDemo_04 {

	public static void main(String[] args) {

		List<User> l = new ArrayList();
		l.add(new User(101,"naresh",34));
		l.add(new User(102,"saurav",23));
		l.add(new User(103,"jagadheesh",78));
		l.add(new User(104,"gautham",18));
		l.add(new User(105,"harsha",15));
		l.add(new User(106,"gopal",67));
		System.out.println("Sorting by age");
		Collections.sort(l, new AgeComparator());
		for(User u : l)
		{
			System.out.println(u.id+"----"+u.name+"----"+u.age);
		}
		System.out.println("Sorting by name");
		Collections.sort(l, new NameComparator());
		for(User u : l)
		{
			System.out.println(u.id+"----"+u.name+"----"+u.age);
		}
	}

}
