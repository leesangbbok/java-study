package ex05_강사님의숙제;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

class addrstat{
	private String gu;
	private int count;
	
	public addrstat(String gu, int count) {
		super();
		this.gu = gu;
		this.count = count;
	}

	public String getGu() {
		return gu;
	}

	public void setGu(String gu) {
		this.gu = gu;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "addrstat [gu=" + gu + ", count=" + count + "]";
	}
	
	
}

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
	
	private static ArrayList<String>  guList;
	private static ArrayList<Integer> count;
	private static int                totCount = 0;
	
	public static void main(String[] args) {
		input();
		process();
		output();
		
	}

private static void input(){
	init_data();
	
}

private static void init_data() {
	//------------------------구 목록 처리
		String[] gu = {"남구","북구","동구","서구","사하구","연제구","동래구","해운대구"};
		
		guList = new ArrayList<String>();
		
	//	guList = (ArrayList<String>) Arrays.asList(gu);
		
		for (int i = 0; i < gu.length; i++) {
			guList.add(gu[i]);
		}
		System.out.println(guList.size());
		
		//-----------------------인원수 배열
		count = new ArrayList<Integer>();
		for (int i = 0; i < guList.size(); i++) {
			count.add(0);
			
		}
		
	
		
	}

private static void process() {
	//파일읽어서 통계구하기
	File       fname1   = new File("src/ex05/in3.txt");
	
	if(!fname1.exists()) {
		System.out.println("파일이 없습니다.");
		System.exit(-1); // 파일이 없어서 익셉션떠서 강제 종료
	}
	
	//try catch : Exception이 발생해도 나머지 명령을 실행해
	
	FileReader     fr       = null;
	BufferedReader br       = null;
	try {
		fr = new FileReader(fname1);
		br = new BufferedReader(fr);
		
		String line = "";
		while((line = br.readLine()) != null) {
			String[] li   = line.trim().split(",");
			String   name = li[0].trim();
			String   gu   = li[1].trim();

			for (int j = 0; j < guList.size(); j++) {
				if(guList.get(j).equals(gu)) {
					int cnt= count.get(j).intValue(); //.intValue() : Integer 에서 int값으로 바꿀때 사용함
					count.set(j, cnt +1);
					break;
				}
			}
			totCount++;
		}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();   //에러메세지를 출력
		System.out.println("파일이없습니다");
	} catch (IOException e) {
		e.printStackTrace();
	} catch(Exception e){
		System.out.println("문제 발생" + e.getMessage());
	}finally { //예외발생상관없이 무조건 실행된다.
		try {
			if(fr != null)fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

private static void output() {
	//통계 출력
	System.out.println("확진자 통계");
	System.out.println("구이름       인원수");
	for (int i = 0; i < guList.size(); i++) {
		String fmt = "%-13s %d";
		String msg = String.format(fmt, guList.get(i), count.get(i));
		System.out.println(msg);
		
	}
	System.out.println("전체 인원수 "+ totCount);
	
}


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
