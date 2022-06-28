package file_io_streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveDuplicatesFromFile {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("file_duplictes.txt");
		BufferedReader br = new BufferedReader(new FileReader("file_duplictes.txt"));
		String line = br.readLine();
		
		while(line!=null)
		{
			boolean available = false;
			BufferedReader br1 = new BufferedReader(new FileReader("output.txt"));
			String target = br1.readLine();
			while(target!=null)
			{
				if(line.equals(target))
				{
					available = true;
					break;
				}
				target = br1.readLine();
			}
			if(available=false)
			{
				pw.println(line);
				pw.flush();
			}
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}

}
