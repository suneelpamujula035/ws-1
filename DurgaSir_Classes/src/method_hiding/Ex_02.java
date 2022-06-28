package method_hiding;

class Parent23{
	public void m1(int...i)
	{
		System.out.println("Parent var-arg method");
	}
}
class Child23 extends Parent23{
	public void m1(int...x)
	{
		System.out.println("Child var-arg method");
	}
}
public class Ex_02 {

	public static void main(String[] args) {
		
		Parent23 p = new Parent23();
		p.m1(23,25,98,76);
		
		Child23 c = new Child23();
		c.m1(12,45,67);
		
		Parent23 pp = new Child23();
		pp.m1(43,87,78,76,56);

	}

}
