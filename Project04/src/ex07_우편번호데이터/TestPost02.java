package ex07_우편번호데이터;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestPost02 {
	
	// zipcode,sido,gugun,dong,bunji,seq
	// 부산 우편번호만 출력
	static String msg = null;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		
		File inFile = new File("c:\\imsi\\zipcode.csv");
		File outFile = new File("c:\\imsi\\bunji.txt");
		
		FileReader     fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(outFile);
		BufferedWriter bw = new BufferedWriter(fw); 
		
		
		String line ="";
		
		br.readLine(); //첫줄은 건너뛰고 데이터를 읽는다.
		while((line= br.readLine()) != null) {
			address_work(bw, line);
			
		}
		
		System.out.println(cnt + "건 입니다.");
		
		bw.close();
		br.close();
		fw.close();
		fr.close();
	}

	private static void address_work(BufferedWriter bw, String line) throws IOException {
		String[] li = line.trim().split(",");
		
		String zipcode = li[0].trim();
		String sido    = li[1].trim();
		String gugun   = li[2].trim();
		String dong    = li[3].trim();
		String bunji   = li[4].trim();
		int    seq     = Integer.parseInt(li[5].trim());
		
		
		if(sido.contains("부산")) {
			msg = String.format("%s \n", bunji);
			bw.write(msg);
			cnt++;
		}
		
	}

}
