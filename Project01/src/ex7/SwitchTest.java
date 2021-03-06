package ex7;

import java.util.Scanner;

class SwitchClass{
	// 띠계산 함수
	public String getDdi(int i){
		
		String ddi = "";
		
		switch(i % 12) {
			case 0 : ddi = "원숭이";
			break;
			case 1 : ddi = "닭";
			break;
			case 2 : ddi = "개";
			break;
			case 3 : ddi = "돼지";
			break;
			case 4 : ddi = "쥐";
			break;
			case 5 : ddi = "소";
			break;
			case 6 : ddi = "호랑이";
			break;
			case 7 : ddi = "토끼";
			break;
			case 8 : ddi = "용";
			break;
			case 9 : ddi = "뱀";
			break;
			case 10 : ddi = "말";
			break;
			case 11 : ddi = "양";
			break;
		}
		return ddi+ "띠";
	} //getDdi end
	
	//나이계산 함수
	public int getAge(int birthYear) {
		int age = 2020 - birthYear + 1;
		return age;
	} //getAge end
	
	//성인미성년 확인 함수
	public boolean isAdult(int bYear) {
		boolean bAdult = false;
		
		if(getAge(bYear) > 19) {
			bAdult = true;
		}else {
			bAdult = false;
		}
		return bAdult;
	}
} //SwitchClass end

public class SwitchTest {
	
	public static void main(String[] args) throws Exception {
		
		//int birthYear = 1950;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = in.nextLine();
		
		System.out.println("출생년도를 입력하세요!");
		int birthYear = in.nextInt();
		System.out.println("정보를 통계중입니다.");
		System.out.println();
		for(int i = 3; i >= 1; i--) {
			Thread.sleep(3000);
			System.out.println(i + " . . .");
		}
		
		
		System.out.println();
		
		SwitchClass sc = new SwitchClass();
		//나이
		System.out.println("당신의 이름은 " + name);
		int age = sc.getAge(birthYear);
		in.close();
		System.out.println("당신의 나이는 " + age + " 세");
		
		//띠
		String ddiStr = sc.getDdi(birthYear);
		System.out.println("당신의 띠는 " + ddiStr);
		
		//성인여부 확인
		boolean bAdult = sc.isAdult(birthYear);
		if(bAdult == true) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자 입니다.");
		}
		
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
