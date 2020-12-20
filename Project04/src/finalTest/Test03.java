package finalTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test03{

	public static void main(String[] args)throws IOException {
		
		String fname1 = "c:\\imsi\\zipcode.csv";
		File      inFile   =  new File(fname1);
		
		FileReader fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> dongList = new ArrayList<String>();
		
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
			
			if(gugun.equals("부산진구") ) {
				if(!pre.equals(dong)) {
					dongList.add(dong);
					pre = dong;
					
				}
				
			}
			
		}
		for (int i = 0; i < dongList.size(); i++) {
			String msg = String.format("%s", dongList.get(i));
			System.out.println(msg);
		}
			if(br != null) br.close();
			if(fr != null) fr.close();
	}

}
