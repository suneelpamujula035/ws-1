package file_io_streams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte_Array_Output_Stream {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout1 = new FileOutputStream("f1.txt");
		FileOutputStream fout2 = new FileOutputStream("f2.txt");
		FileOutputStream fout3 = new FileOutputStream("f3.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();//it is used to write common data into multiple files
	    String s = "Java is an Object Oriented programming Language";
	    byte[] b = s.getBytes();
	    bout.write(b);
	    bout.writeTo(fout1);
	    bout.writeTo(fout2);
	    bout.writeTo(fout3);
	    bout.flush();
	    bout.close();
	}

}
