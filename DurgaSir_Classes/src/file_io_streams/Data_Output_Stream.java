package file_io_streams;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data_Output_Stream {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("f4.txt");
		DataOutputStream dout = new DataOutputStream(fout);
		dout.write(67);
		dout.flush();
		dout.close();
		fout.close();
	}

}
