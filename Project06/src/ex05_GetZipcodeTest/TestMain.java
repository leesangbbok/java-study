package ex05_GetZipcodeTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.text.html.HTMLEditorKit.Parser;



public class TestMain {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		DBHandler db = new DBHandler();
		File  infile = new File("c:\\imsi\\zipcode.csv");
		
		FileReader fr  = new FileReader(infile);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		br.readLine();
		while((line = br.readLine())!= null) {
			String[] li = line.trim().split(",");
			
			String zipcode = li[0].trim();
			String sido = li[1].trim();
			String gugun = li[2].trim();
			String dong = li[3].trim();
			String bunji = li[4].trim();
			int      seq = Integer.parseInt( li[5].trim());
			
			for (int i = 0; i < li.length; i++) {
				System.out.print(li[i]);
			}
			System.out.println();
			
			db.insertZipcode(zipcode, sido, gugun, dong, bunji, seq);
			
		}
		System.out.println("데이터 입력 성공");
		
		if(br != null )br.close();
		if(fr != null )fr.close();
	}

}
