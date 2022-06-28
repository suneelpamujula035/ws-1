package file_io_streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_01 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("aaaa.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		br.close();	
	}

}
