package ex07_우편번호데이터;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestPost01 {
	// ZIPCODE 우편번호 7
	// SIDO 특별시,광역시,도 4
	// GUGUN 시,군,구 17
	// DONG 읍,면,동,리,건물명 52
	// BUNJI 번지,아파트동,호수 17
	// SEQ 데이터 순서 5
	// 우편번호 데이터 수 52,144

	//zipcode,sido,gugun,dong,bunji,seq
	
	//전국의 "롯데백화점"의 갯수 출력
	
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		
		String fName  = "c:\\imsi\\zipcode.csv";
		File   inFile = new File(fName);
		
		FileReader     fr = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		//첫번째 라인은 건너뛰기 skip : 제목줄
		br.readLine();
		long startTime = System.nanoTime();
		while((line = br.readLine()) != null) {
			//String[] li = line.trim().split(",");
			address_work(line);
		}
		long endTime = System.nanoTime();
		
		System.out.println("소요시간 : "  + (endTime - startTime) / 1000.0 / 1000.0 / 1000.0 +"초");
		
		System.out.println(cnt+ "건 입니다.");
		
		
		
		
		
		
		br.close();
		fr.close();
	}

	private static void address_work(String line) {
		String[] li = line.trim().split(",");
		
		// zipcode,sido,gugun,dong,bunji,seq
		String zipcode = li[0].trim();
		String sido    = li[1].trim();
		String gugun   = li[2].trim();
		String dong    = li[3].trim();
		String bunji   = li[4].trim();
		int seq     = Integer.parseInt(li[5].trim());
		
		if(sido.contains("울산") && dong.contains("현대백화점")) {
			System.out.println(line);
			cnt++;
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
