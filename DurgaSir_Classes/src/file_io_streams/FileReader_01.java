package file_io_streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("ssss.txt");
		int i = fr.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i = fr.read();
		}
		
//		File f = new File("ssss.txt");
//		char ch[] = new char[(int) f.length()];
//		FileReader fr1 = new FileReader(f);
//		fr.read(ch);
//		for(char ch1 : ch)
//		{
//			System.out.println(ch);
//
//		}
	}

}
