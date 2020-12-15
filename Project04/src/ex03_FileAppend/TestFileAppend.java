package ex03_FileAppend;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileAppend {
	
	// append : 기존파일의 마지막에 데이터를 추가
	
	public static void main(String[] args) throws IOException {
		
		File       file      = new File("c:\\imsi\\out3.txt");
		
		//새 파일 생성
		//FileWriter fw        = new FileWriter(file);
		//fw.close();
		
		//추가모드롤 열기
		FileWriter fw   = new FileWriter(file, true);  //true : append mode
		
		fw.write("Hello\n");
		
		fw.close();
		
	}

}
