package exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class Try_with_resources {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new FileReader("aaaa.txt")))
		{
			String line = br.readLine();
			while(line !=null)
			{
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
