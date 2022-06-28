package test;

class Animal{
	String s = "KFC-Parent Instance";
	public void food()
	{
		int x = 15;
		System.out.println("Some or Vegans and some or Non-vegeterians ---- "+x);
	}
	public void fly()
	{
		int y = 80;//For local variables only default modifier is valid here and also we can declare the variable as final
		System.out.println("Animals can't fly -----"+y);
	}
	public int legs()
	{
		int k = 4;
		return k;
	}
}
public class Demo extends Animal {

	String s = "KFC-instance";
	public void food()
	{
		System.out.println("-----------Chicken-----------");
	}
	void hello()
	{
		String s = "KFC-local";
		System.out.println("---------------------------------------------");
		super.fly();
		System.out.println("---------------------------------------------");
		super.food();
		System.out.println("----------------------"+ s+"-----------------------");
		System.out.println("----------------------"+ this.s+"-----------------------");
		System.out.println("----------------------"+ super.s+"-----------------------");
		
	}
	public static void main(String[] args) {

		//Animal a = new Animal();
		Demo a = new Demo();
		a.food();
		a.fly();
		System.out.println("Mostly animals have "+a.legs()+" legs");
		a.hello();
	}

}
