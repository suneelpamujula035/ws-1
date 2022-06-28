package method_overriding;

class P{
	public Object m1()
	{
		return null;
	}
}
class C extends P{
	@Override
	public String m1()
	{
		return null;
	}
}
public class Ex_02 {

	public static void main(String[] args) {

		P p = new P();
		p.m1();
		C c = new C();
		c.m1();
	}

}
