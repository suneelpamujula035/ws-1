package constructors;

public class No_Of_Objects_Created {

	static int count = 0;
	{
		count++;
	}
	No_Of_Objects_Created()
	{
		
	}
	public No_Of_Objects_Created(int i)
	{
		
	}
	private No_Of_Objects_Created(double d)
	{
		
	}
	No_Of_Objects_Created(String s)
	{
		
	}
	protected No_Of_Objects_Created(Object o)
	{
		
	}
	No_Of_Objects_Created(char c)
	{
		
	}
	public static void main(String[] args) {

		No_Of_Objects_Created n1 = new No_Of_Objects_Created();
		No_Of_Objects_Created n2 = new No_Of_Objects_Created();
		No_Of_Objects_Created n3 = new No_Of_Objects_Created("hello");
		No_Of_Objects_Created n4 = new No_Of_Objects_Created();
		No_Of_Objects_Created n5 = new No_Of_Objects_Created(12.7);
		No_Of_Objects_Created n6 = new No_Of_Objects_Created(new Object());
		System.out.println("Number of objects created : "+count);
	}

}
