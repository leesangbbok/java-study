package finalTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//부산지역에 구 목록만 출력하기

public class Test02 {

	public static void main(String[] args)throws IOException {
		
		String fname1 = "c:\\imsi\\zipcode.csv";
		File      inFile   =  new File(fname1);
		
		FileReader fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> guList = new ArrayList<String>();
		
		String line = "";
		String pre="";
		br.readLine();
		
		while((line = br.readLine()) != null) {
			String[] li = line.trim().split(",");
			
			//zipcode,sido,gugun,dong,bunji,seq
			
			String zipcode = li[0].trim();
			String sido       = li[1].trim();
			String gugun    = li[2].trim();
			String dong      = li[3].trim();
			String bunji      = li[4].trim();
			int      seq = Integer.parseInt(li[5].trim());
			
			if(sido.equals("부산") ) {
				if(!pre.equals(gugun)) {
					guList.add(gugun);
					pre = gugun;
					
				}
				
			}
			
		}
		for (int i = 0; i < guList.size(); i++) {
			String msg = String.format("%s", guList.get(i));
			System.out.println(msg);
		}
			if(br != null) br.close();
			if(fr != null) fr.close();
	}

}
