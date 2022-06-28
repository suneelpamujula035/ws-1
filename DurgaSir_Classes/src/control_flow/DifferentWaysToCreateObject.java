package control_flow;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;

public class DifferentWaysToCreateObject {

	DifferentWaysToCreateObject()
	{
		System.out.println("Default constructor");
	}
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {

		DifferentWaysToCreateObject t1 = new DifferentWaysToCreateObject();
		
		//DifferentWaysToCreateObject t2 = (DifferentWaysToCreateObject) Class.forName("DifferentWaysToCreateObject").newInstance();
		
		Runtime r = Runtime.getRuntime();
		DateFormat df = DateFormat.getInstance();
		
		//DifferentWaysToCreateObject t2 = (DifferentWaysToCreateObject)t1.clone();
		
		FileInputStream fos = new FileInputStream("abc.ser");
		ObjectInputStream oos = new ObjectInputStream(fos);
		DifferentWaysToCreateObject t3 = (DifferentWaysToCreateObject)oos.readObject();
	}

}
