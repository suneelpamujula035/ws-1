package file_io_streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Sequence_Input_Stream {

	public static void main(String[] args) throws IOException {

		FileInputStream fin1 = new FileInputStream("file1.txt");
		FileInputStream fin2 = new FileInputStream("file2.txt");
		SequenceInputStream sin = new SequenceInputStream(fin1, fin2);//it is used to read data from multiple files
		int i = sin.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i = sin.read();
		}
		sin.close();
		fin1.close();
		fin2.close();
	}

}
