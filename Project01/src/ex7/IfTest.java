package ex7;

import java.util.Calendar;
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		int age;							//나이
		//int birthYear = 1992;		//출생연도
		
		//출생연도 입력받기
		Scanner sc = new  Scanner(System.in);
		int birthYear = sc.nextInt(); 
		
		
		//현재년도 구하기
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		
		age =   year - birthYear;
		
		if(Math.log10(birthYear) + 1 > 5) {
			System.out.println("출생년도는 4자리 까지 입력 해주세요.");
			System.exit(-1);
		}else if(age >= 20) {
			System.out.println("만 " + age + "세 " + "성인입니다.");
		}else{
			System.out.println("만 " + age + "세 " + "미성년입니다");
		}
		
		sc.close();
	}

}
