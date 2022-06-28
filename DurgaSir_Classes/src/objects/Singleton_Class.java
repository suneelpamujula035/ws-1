package objects;

public class Singleton_Class {

	public static Singleton_Class s = null;
	private Singleton_Class()
	{
		
	}
	public static Singleton_Class getInstance()
	{
		if(s==null)
		{
			s = new Singleton_Class();
		}
		return s;
	}
	public static void main(String[] args) {

		Singleton_Class s1 = Singleton_Class.getInstance();System.out.println(s1.hashCode());
		Singleton_Class s2 = Singleton_Class.getInstance();System.out.println(s2.hashCode());
		Singleton_Class s3 = Singleton_Class.getInstance();System.out.println(s3.hashCode());
		Singleton_Class s4 = Singleton_Class.getInstance();System.out.println(s4.hashCode());
		Singleton_Class s5 = Singleton_Class.getInstance();System.out.println(s5.hashCode());
	
	}

}
