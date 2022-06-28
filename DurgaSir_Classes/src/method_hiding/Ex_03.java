package method_hiding;

class Num1{
	int x = 888;
}
class Num2 extends Num1{
	int x = 999;
}
public class Ex_03 {

	public static void main(String[] args) {

		Num1 n1 = new Num1();
		System.out.println(n1.x);
		
		Num2 n2 = new Num2();
		System.out.println(n2.x);
		
		Num1 nn = new Num2();
		System.out.println(nn.x);
	}

}
