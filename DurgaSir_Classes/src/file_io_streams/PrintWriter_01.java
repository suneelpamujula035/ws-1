package file_io_streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_01 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("abc.txt");
		PrintWriter out = new PrintWriter(fw);
		out.print(100);
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("suneel");
		out.flush();
		out.close();
	}

}
