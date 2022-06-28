package method_overloading;

class Animal{
	
}
class Monkey extends Animal{
	
}
public class Test {

	public void m1(Animal a)
	{
		System.out.println("animal version");
	}
	public void m1(Monkey m)
	{
		System.out.println("monkey version");
	}
	public static void main(String[] args) {

		Animal a = new Animal();
		Monkey m = new Monkey();
		Animal a1 = new Monkey();
		
		Test t = new Test();
		t.m1(a);
		t.m1(m);
		t.m1(a1);
	}

}
