package ex04_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestInputStream {
	
	
	//Stream : byte단위 입출력 - binary
	public static void main(String[] args) throws IOException {
		String inFile = "c:\\imsi\\in.txt";
		
		FileInputStream fis = new FileInputStream(inFile);
		
		int ch;
		while((ch = fis.read()) != -1) {
			System.out.println(ch);
		}
		
		
		
		fis.close();
	}

}
