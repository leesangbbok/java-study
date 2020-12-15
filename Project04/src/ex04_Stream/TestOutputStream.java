package ex04_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {

	public static void main(String[] args) throws IOException {
		String fname = "c:\\imsi\\out4.txt";
		
		FileOutputStream fos = new FileOutputStream(fname);
		
		for (int ch = 'A'; ch < 'Z'; ch++) {
			fos.write(ch);
		}
		
		fos.close();

	}

}
