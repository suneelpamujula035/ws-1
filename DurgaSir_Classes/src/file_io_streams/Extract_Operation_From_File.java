package file_io_streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Extract_Operation_From_File {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("output.txt");
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String line = br.readLine();
		
		while(line!=null)
		{
			boolean available = false;
			BufferedReader br1 = new BufferedReader(new FileReader("delete.txt"));
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
			}
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}
