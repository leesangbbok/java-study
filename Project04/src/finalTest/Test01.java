package finalTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) throws IOException {
		String fname1 = "c:\\imsi\\zipcode.csv";
		File      inFile   =  new File(fname1);
		
		FileReader fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("동명을 입력해주세요.");
		String input = in.nextLine();
		
		String line = "";
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
			
			if(dong.contains(input)) {
				String msg = String.format("%s", line);
				System.out.println(msg);
			}
			
		}
		
		fr.close();
		
	}

}
