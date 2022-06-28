package file_io_streams;

import java.io.File;
import java.io.IOException;

public class Files_01 {

	public static void main(String[] args) throws IOException {
	
		File f = new File("ssss.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		File f1 = new File("suneel1234");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
		
		File f2 = new File("suneel1234","demo3.txt");
		System.out.println(f2.exists());
		f2.createNewFile();
		System.out.println(f2.exists());
	}
}
