package constructors;

public class Constructor_Overloading {

	Constructor_Overloading()
	{
		this(15);
		System.out.println("default-constructor");
	}
	Constructor_Overloading(int i)
	{
		this(12.8);
		System.out.println("int-constructor");
	}
	Constructor_Overloading(double d)
	{
		System.out.println("double-constructor");
	}
	public static void main(String[] args) {

		Constructor_Overloading c1 = new Constructor_Overloading();
		System.out.println("----------------------");
		Constructor_Overloading c2 = new Constructor_Overloading(23);
		System.out.println("----------------------");
		Constructor_Overloading c3 = new Constructor_Overloading(43.65);


	}

}
