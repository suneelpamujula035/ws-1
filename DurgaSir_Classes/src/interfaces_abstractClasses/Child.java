package interfaces_abstractClasses;

class Parent
{
	Parent()
	{
		System.out.println(this.hashCode());
	}
}
public class Child {

	Child()
	{
		System.out.println(this.hashCode());
	}
	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.hashCode());
	}

}
