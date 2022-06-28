package file_io_streams;

import java.io.ByteArrayInputStream;

public class Byte_Array_Input_Stream {

	public static void main(String[] args) {

		byte buff[] = {35,36,37,38};
	    ByteArrayInputStream byt = new ByteArrayInputStream(buff);
	    int i = byt.read();
	    while(i!=-1)
	    {
	    	char ch = (char)i;
	    	System.out.println("ASCII value of Character is:" + i + "; Special character is: " + ch);
	    	i = byt.read();
	    }
	}

}
