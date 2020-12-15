package ex02_FileReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Student{
	//변수
	private int    num;
	private String name;
	private int    kor;
	private int    eng;
	private int    mat;
	private int    tot;
	private int    avg;
	
	//생성자 - Constructor
	public Student(int num, String name, int kor, int eng, int mat) {
		this.num  = num;
		this.name = name;
		this.kor  = kor;
		this.eng  = eng;
		this.mat  = mat;
		
	}
	
	public int getTot() {
		int tot = kor + eng + mat;
		return tot;
	}
	public int getAvg() {
		int avg = (int)Math.round(getTot()/3.0);
		return avg;
	}
	public char getGrade() {
		String grade = "FFFFFDCBAA";
		int gr = getAvg() / 11;
		return grade.charAt(gr);
	}
	
	@Override
	public String toString() {
		String fmt ="%03d %s %d %d %d %d %d %c\n";
		String msg = String.format(fmt, num,name,kor,eng,mat, getTot(), getAvg(), getGrade());
		return msg;
	}
	
	
		
}
public class TestReaderSungjuk {

	public static void main(String[] args) throws IOException {
		String fname1     = "c:\\imsi\\inin.txt"; //입력
		String fname2     = "c:\\imsi\\out2.txt"; //출력
		
		File inFile       = new File(fname1);
		File outFile      = new File(fname2);
		
		FileReader fr     = new FileReader(inFile);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw     = new FileWriter(outFile);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line = "";
		int cnt = 0;
		while((line = br.readLine()) != null) {
			String[] li = line.trim().split(",");
			int num = Integer.parseInt(li[0]);
			String name = li[1];
			int kor = Integer.parseInt(li[2]);
			int eng = Integer.parseInt(li[3]);
			int mat = Integer.parseInt(li[4]);
			
			Student studs = new Student(num, name, kor, eng, mat);
			bw.write(studs.toString());
			cnt++;
		}
		
		System.out.println(cnt + "건 저장되었습니다.");
		
		bw.close();
		br.close();
		fw.close();
		fr.close();

	}

}
