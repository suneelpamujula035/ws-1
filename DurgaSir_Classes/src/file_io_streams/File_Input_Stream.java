package file_io_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class File_Input_Stream {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("file5.txt");
		int i = fin.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i = fin.read();
		}
		fin.close();
	}

}
