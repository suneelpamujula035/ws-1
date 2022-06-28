package file_io_streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class File_Output_Stream {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("file5.txt");
		String s = "Welcome to java tutorials";
		byte[] b = s.getBytes();
		fout.write(b);
		fout.flush();
		fout.close();
	}

}
