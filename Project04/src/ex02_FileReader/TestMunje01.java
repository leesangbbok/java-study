package ex02_FileReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestMunje01 {
	/*
	 * 예제01
	 * 임시폴더안에 있는 메모장에서 텍스트를 읽고 성적메모장으로 출력하기
	 * */
	
	public static void main(String[] args) throws IOException {
		
		//파일 읽어오기
		String fileName = "C:\\imsi\\in.txt";
		File inFile     = new File(fileName);
		
		if(!inFile.canExecute()) { //파일이 존재하는지 확인
			System.out.println("파일이 없습니다.");
			return;
		}
		    
		FileReader fr      = new FileReader(inFile);
		BufferedReader br  = new BufferedReader(fr);
		
		String outFileName = "c:\\imsi\\outSungjuk.txt";
		File outFile       = new File(outFileName);
		FileWriter fw      = new FileWriter(outFileName);
		BufferedWriter  bw = new BufferedWriter(fw); 
		
		String line = "";
		while((line = br.readLine()) != null) {
			System.out.println(line);
			writeData(bw,line);
		}
		System.out.println();
		System.out.println(outFile.getName() + "이 저장되었습니다");
		
		
		bw.close();
		br.close();
		fw.close();
		fr.close();
	}

	private static void writeData(BufferedWriter bw, String line) throws IOException {
		int num;
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		int avg;
		
		String[] str = line.trim().split(",");
		
		num  = Integer.parseInt(str[0]);
		name = str[1];
		kor  = Integer.parseInt(str[2]);
		eng  = Integer.parseInt(str[3]);
		mat  = Integer.parseInt(str[4]);
		tot  = (kor + eng + mat);
		avg  = tot/3;
		
		String fmt = "%d %s %d %d %d %d %d\n";
		String msg = String.format(fmt, 
				num, name, kor, eng, mat, tot ,avg
		);
		bw.write(msg);
		
		
		//System.out.println(num + name + kor + eng + mat);
		
	}

}
