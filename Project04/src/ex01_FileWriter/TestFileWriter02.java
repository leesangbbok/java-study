/*
 * 키보드입력 -> file저장
 * 
 * */
package ex01_FileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriter02 {

	public static void main(String[] args) throws IOException {
		String fileName = "C:\\imsi\\out.txt";
		File oFile = new File(fileName);
		
		FileWriter fw = new FileWriter(oFile);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//키보드 입력
		Scanner in = new Scanner(System.in);
		
		System.out.println("번호, 이름, 국어, 영어, 수학");
		System.out.println("종료 : exit");
		
		boolean isFirst = true;
		int cnt = 0; //저장 자료갯수
		while(true) {//무한루트
		
		String line = in.nextLine();
			if(line .equalsIgnoreCase("exit")) { //.equalsIgnoreCase 대소문자 구분없이 확인
				break;  //exit 입력되면 탈출
				
			}
			if(isFirst) {
				bw.write("번호 이름 국어 영어 수학 총점 평균 \n");
				isFirst = false;
			}
			writeData(bw,line);
			cnt++;
		}
		
		System.out.println(cnt + "줄 저장되었습니다.");
		
		in.close();
		bw.close();
		fw.close(); //규칙이다. 열어줬으면 .close()로 닫아줘야한다. 생성해준 순서대로 닫아야한다
		
		System.out.println(oFile.getName() + "이 생성되었습니다");
		

	}

	private static void writeData(BufferedWriter bw, String line) throws IOException {
		int    num;
		String name;
		int    kor, eng, mat;
		int    tot, avg;
		
		String[] li = line.trim().split(",");
		
		num = Integer.parseInt(li[0]);
		name = li[1].trim();
		kor = Integer.parseInt(li[2].trim());
		eng = Integer.parseInt(li[3].trim());
		mat = Integer.parseInt(li[4].trim());
		tot = (kor + eng + mat);
		avg = tot/3;
		
		String fmt = "%d %s %d %d %d %d %d\n";
		String msg = String.format(fmt, 
				num, name, kor, eng, mat, tot ,avg
		);
		bw.write(msg);
		
	}

}
