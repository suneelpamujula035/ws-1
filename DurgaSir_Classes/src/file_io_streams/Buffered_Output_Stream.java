package file_io_streams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered_Output_Stream {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("file6.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Hello friends How are you I hope you all doing good";
		byte[] b = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
	}

}
