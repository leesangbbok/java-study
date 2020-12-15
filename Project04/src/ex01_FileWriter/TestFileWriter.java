//12월 15일 오전 수업
	// IO : 파일입출력처리 + 예외처리 필수 : Try 문 아니면 IOException 걸어주기
	/*
	 * File
	 * - 프로그램언어에서 파일의 종류
	 * TextFile : 모든 data글자로 인지 (ASCiiCode, uniCode)
	 * 
	 * 엔터 : 2 byte
	 * Line Feed \n - 한줄 이동  
	 * Carriage Return \r - 커서 맨 앞으로 이동
	 * 
	 * CRLF - WINDOW
	 * LF - UNIX, LINUX, MAC, ANDROID
	 * 
	 * Binary File 
	 * Binary파일 전문 클래스 - byte단위처리
	 * - Stream : 시냇물 - 어떤 data의 한 방향으로 흐름
	 * 
	 * 
	 * Text파일 전문 클래스 - data:text
	 * - TextReader
	 * - TextWriter
	 * 
	 * 입력=========================
	 * Input, Writer
	 * 
	 * InputStream - 바이트 입력
	 * OutputStream - 바이트 출력
	 * 
	 * Read : Text 위주 입력
	 * Write : Text 위주 출력
	 * 
	 * */

package ex01_FileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	
	public static void main(String[] args) throws IOException {
		
		//새로운 파일 생성
		//file명 : 경로명 + 파일명;
		
		//C:\\imsi\\abc4.txt - 윈도우스타일 (\\ 역슬래시는 반드시 2개, / 그냥 슬래시 해도 됌)
		//C:/imsi/abc4.txt - Linux스타일       
		
		//FileWriter : 속도가 느림
		//BufferedWriter : Buffer 라는 중간 메모리에 먼저 저장하고 한번에 디스크에 저장 : 속도가 빨라짐
		//Reader, Writer : 대상 Text
		
		File outFile = new File("c:/imsi/abc5.xlsx");
		
		FileWriter fw1 = new FileWriter(outFile);
		BufferedWriter bw1 = new BufferedWriter(fw1); //입출력속도 향상
		
		String msg = "";
		String[] names = {"한지평","서인재","남도산","서달미", "이철산"};
		
		for (int i = 0; i < names.length; i++) {
			msg = String.format("%d %s", i+1, names[i] + " ");
			bw1 .write(msg);
		}
		
		bw1.close();
		fw1.close();
		
		System.out.println(outFile.getName() + "이 생성되었습니다.");
		
		if(outFile.canExecute()) {
			System.out.println("파일존재 유");
		}else {
			System.out.println("파일존재 무");
		}
		
	}

}
