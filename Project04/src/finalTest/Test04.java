package finalTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//지역별로 주소를 각각 메모장파일로 생성하기 ex ) 서울.txt, 부산,txt, 울산.txt ....충북.txt 까지

public class Test04{

	public static void main(String[] args)throws IOException {
		String fname1 = "c:\\imsi\\zipcode.csv";
		File      inFile   =  new File(fname1);
		FileReader fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> sidoListSet = new ArrayList<String>();
		ArrayList<String> sidoList = new ArrayList<String>();
		ArrayList<String> jusoList = new ArrayList<String>();
		
		String line = "";
		String pre="";
		int count = 0;
		br.readLine();
		while((line = br.readLine()) != null) {
			String[] li = line.trim().split(",");
			
			String zipcode = li[0].trim();
			String sido       = li[1].trim();
			String gugun    = li[2].trim();
			String dong      = li[3].trim();
			String bunji      = li[4].trim();
			int      seq = Integer.parseInt(li[5].trim());
			
			sidoList.add(sido);
			jusoList.add(line);
			
			//중복되지않게 지역별로 값을 넣음
			if(sido.equals(sido)) {
				if (!pre.equals(sido)) {
					sidoListSet.add(sido);
					pre = sido;
				}
			}
			count++;
		}//while문 END
		
		
		for (int i = 0; i < sidoListSet.size(); i++) {				
			String               fileName =  sidoListSet.get(i);			
			String               fname2   = "c:\\imsi\\address\\" + fileName + ".txt";
			File                    outFile    =  new File(fname2);
			FileWriter          fw          = new FileWriter(outFile);
			BufferedWriter bw         = new BufferedWriter(fw);
			for (int j = 0; j < count;  j++) {											//우편데이터의 5만몇천건의 수만큼 반복
				if(sidoList.get(j).equals(sidoListSet.get(i))) {			//sidoListSet의 ArrayList 첫 번째값부터 sidoList와 비교하여 시작
					String msg = String.format("%s \n", jusoList.get(j));		//if문의 true 이면 line값이 들어간 jusoList를 출력해서 지역별로 파일로 생성
					bw.write(msg);
				}
			}
			if(bw != null) bw.close();
			if(fw != null) fw.close();
		}
			if(br != null) br.close();
			if(fr != null) fr.close();
	}
}
