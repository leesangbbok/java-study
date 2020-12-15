package ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestAddress {

//결과   구          인원수
	//남구           
 	//북구
	//동구
	//서구
	//사하구
	//연제구
	//동래구
	
	//전체 인원수
	public static void main(String[] args) throws IOException {
		
		String fname1 = "c:\\imsi\\in3.txt";
		String fname2 = "c:\\imsi\\addressNum.txt";
		
		File inFile = new File(fname1);
		File outFile = new File(fname2);
		
		FileReader fr = new FileReader(inFile);
		FileWriter fw = new FileWriter(outFile);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
		
		String line = "";
		int cnt = 0;
		int n1=0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;
		int n7 = 0;
		while((line= br.readLine()) != null) {
			String[] li = line.split(",");
			
			String addr = li[1];
			
			
			writeData(addr);
			
		}
		
		
		
		bw.close();
		br.close();
		fw.close();
		fr.close();
	}

private static String writeData(String addr) {
	System.out.println(addr);

	return addr;
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
