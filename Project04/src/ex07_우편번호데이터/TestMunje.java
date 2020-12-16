package ex07_우편번호데이터;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMunje {

	//전국의 시도별 우편번호 갯수의 통계를 작성하라 
	// ex) 서울8901, 부산2300 . . .
	
	
	private static ArrayList<String> sidoList; 
	private static ArrayList<Integer> bunjiCnt;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		input();
		process();
		output();
	}

	private static void input() {
		init_data();
	}

	private static void init_data() {
		//시도별 목록 처리
		String[] si = {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "강원", "경기", "경남", "경북", "전남", "전북", "제주", "충남", "충북"};
		
		sidoList = new ArrayList<>();
		
		//sidoList에 si배열을 넣는다.
		for (int i = 0; i < si.length; i++) {
			sidoList.add(si[i]);
		}
		
		//각 시도별 우편번호가 총 몇개인지 카운트하기 위해 전부 다 0으로 초기화
		bunjiCnt = new ArrayList<>();
		for (int i = 0; i < sidoList.size(); i++) {
			bunjiCnt.add(0);
		}
		
		
		
		
	}

	private static void process() throws IOException {
		File           fname1 = new File("c:\\imsi\\zipcode.csv");
		FileReader     fr     = new FileReader(fname1);
		BufferedReader br     = new BufferedReader(fr); //BufferedReader사용이유 : FileReader로 읽으면 하드디스크로 읽어서 처리 하기때문에 속도가 많이 느림 그래서 BufferedReader로 읽는속도를 향상시킴
		
		String line = ""; //초기화 공백값으로 
		br.readLine(); //우편번호데이터 첫 번째 라인이 필요없기때문에 다음줄로 건너뛴다.
		while((line = br.readLine()) != null) {
			String[] li = line.trim().split(",");
			
			//zipcode,sido,gugun,dong,bunji,seq
			String zipcode = li[0].trim();
			String sido    = li[1].trim();
			String gugun   = li[2].trim();
			String dong    = li[3].trim();
			String bunji   = li[4].trim();
			int    seq     = Integer.parseInt(li[5].trim());
			
			for (int i = 0; i < sidoList.size(); i++) {
				if(sidoList.get(i).equals(sido)) {
					int cnt = bunjiCnt.get(i).intValue(); //.inValue() : Integer에서 int타입으로 바꿀때 사용한다.
					bunjiCnt.set(i, cnt+1);
					break;
				}
			}
		}
		
		br.close();
		fr.close();
	}

	private static void output() {
		//통계출력
		for (int i = 0; i < sidoList.size(); i++) {
			String msg = String.format("%-5s %s", sidoList.get(i), bunjiCnt.get(i));
			System.out.println(msg);
		}
	}
	
	
	

	

}
