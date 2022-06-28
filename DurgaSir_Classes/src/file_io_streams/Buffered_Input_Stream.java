package file_io_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Buffered_Input_Stream {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("file6.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i = bin.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i = bin.read();
		}
		bin.close();
		fin.close();
	}

}
