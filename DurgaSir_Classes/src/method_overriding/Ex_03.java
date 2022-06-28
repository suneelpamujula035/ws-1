package method_overriding;

import java.io.EOFException;
import java.io.IOException;

class Parent34{
	public void m1() throws IOException
	{
		
	}
}
public class Ex_03 extends Parent34 {

	
	@Override
	public void m1() throws EOFException {
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
