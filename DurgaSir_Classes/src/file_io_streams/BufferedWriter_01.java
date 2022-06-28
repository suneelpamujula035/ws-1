package file_io_streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_01 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("aaaa.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);//it prints d
		bw.newLine();
		char ch[] = {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("suneel");
		bw.newLine();
		bw.write("kumar");
		bw.flush();
		bw.close();
	}

}
