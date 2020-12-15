package ex02_FileReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;

//파일읽어오기

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReader {
	
	//throws : 에외처리를 던진다 : 함수를 부르느 곳으로
	public static void main(String[] args) throws IOException {
		String fileName = "C:\\imsi\\in_name.dat";
		
		File inFile     = new File( fileName );
		
		FileReader fr  = new FileReader(inFile); //C:\\imsi\\in.txt에 있는 in.txt파일을 읽어온다.
		BufferedReader br = new BufferedReader(fr);//읽는속도 향상
		
		String outFileName = "c:\\imsi\\outName2.txt";
		FileWriter fw = new FileWriter(outFileName);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line = ""; //br.readLine(); //.readLine()한줄씩 읽는다.
		
		int n = 1;
		while((line = br.readLine()) != null){ //읽은자료가 있으면, null이 아니면
			//읽은자료가 있으면  or null 아니면
			String fmt = "%03d %s \n";
			String msg = String.format(fmt, n, line);
			System.out.print(msg);
			bw.write(msg);
			n++;
		}
		System.out.println("복사완료");
		
		bw.close();
		br.close();
		fw.close();
		fr.close();
	}

}
