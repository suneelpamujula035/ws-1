package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo_01 {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("yyyy.txt");
		p.load(fis);
		System.out.println(p);
		Enumeration<?> propertyNames = p.propertyNames();
		System.out.println(propertyNames);
		String s = p.getProperty("venky");
		System.out.println(s);
		p.setProperty("nag", "9988");
		FileOutputStream fos = new FileOutputStream("yyyy.txt");
		p.store(fos, "success");
		
	}

}
