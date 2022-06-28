package file_io_streams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_01 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("ssss.txt");
		fw.write(100);// it prints d=100 in ASCII table
		fw.write("durga \n software solutions");
		fw.write("\n");
		char ch[] = {'A','B','C','D','E'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
	}

}
