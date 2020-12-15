package ex19;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		//문자열 조작 함수들
		//문자열 저장방법
		
		String s1 = " Hello 李순신 123 +";
		String s2 = new String("안녕하세요 mark 41");
		
		System.out.println(s1);
		System.out.println(s2);
		
		//---------------------------------------------
		
		//문자열 길이
		int len1 = s1.length();
		System.out.println(len1);
		
		//---------------------------------------------
		
		//특정위치의 문자
		char c1 = s1.charAt(7);
		System.out.println(c1); 
		
		//---------------------------------------------
		
		//문자열 비교 
		String s3 = "이순신";
		String s4 = "이순신";
		System.out.println(s3 == s4);     // 주소비교 true
		System.out.println(s3.equals(s4)); //데이터비교 true
		
		String s5 = new String("이순신");
		String s6 = new String("이순신");
		
		System.out.println(s5 == s6);    //주소비교 false
		System.out.println(s5.equals(s6)); //데이터비교 true
		
		.equalsIgnoreCase() //대소문자 구분없이 비교함
		
		//---------------------------------------------
		
		//문자, 문자열 찾기
		String s9 = "ABCDEFGHJK";
		System.out.println(s9.indexOf('F'));
		System.out.println(s9.indexOf("CDE"));
		
		//---------------------------------------------
		
		//비교 : 글자의 순서 비교
		String s10 = "이순신";
		String s11 = "이이";
		int p = s10.compareTo(s11);
		System.out.println(p);
		
		//---------------------------------------------
		
		//contains() :: 포함되어있는지 알아보는 함수 
		System.out.println(s9.contains("ABC"));
		System.out.println(s9.contains("abc"));
		
		//---------------------------------------------
		
		//대문자로 변경 : toUpperCase()
		//소문자로 변경 : toLowerCase()
		String dd =s9.toLowerCase();
		
		//---------------------------------------------
		
		//문자열 추출
		//nameStr.split(",") :: 문자열을 구분기호(, ) 를 각각 구분하여 배열로 만들어주는 함수
		String nameStr = "짱구,짱아,철수,희동,둘리,다오";
		//String [] names = {"짱구","짱아","철수","희동","둘리","다오"};
		String [] names = nameStr.split(",");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		String str1 = "abcdefghijk";
		String [] strSplit = str1.split("");
		System.out.println(Arrays.toString(strSplit));
		
		//---------------------------------------------
		
		//문자열 추출
		//substring (시작번호, 끝번호);
		//123456-7890123
		// 234567 8902345
		//합계 % 11  = ? 
		// 11 - ? = ?? : ??값이 맨 뒷자리 번호가 일치해야 주민번호가 유효함
		String nationnalId = "920904-1357339";
		String gender01 = nationnalId.substring(7, 8);
		int gender02 = Integer.parseInt(gender01); //Integer.parseInt 은 String 울 int 타입으로 파싱함
		if (gender02 % 2 == 0) {
			System.out.println("여자");
		}else {
			System.out.println("남자");
		}
		//juminNum("011015-3850112");
		
		//---------------------------------------------
		
		String firstName = "John";
		String lastName = "Doe";
		
		//문자열 결합 ( + ) :: 보통은 이걸 많이 쓴다고 함 
		String fullName = firstName + " "+ lastName;
		System.out.println(fullName);
		
		// 문자열 결합 함수
		//method Chaining
		fullName = firstName.concat(" ").concat(lastName);
		System.out.println(fullName);
		
		//String 보다 StringBuilder 를 사용하면 속도가  빠름 [ 추천 ]! 
		// But JAVA 1.5 부터 컴파일 할 때 + 연산은 내부적으로 전부 StringBuilder 변환 해준다.
		StringBuilder sb = new StringBuilder();
		sb.append("Hellow");
		sb.append(" ");
		sb.append("World");
		System.out.println(sb.toString());
		
		//---------------------------------------------
		
		//문자열 수정
		String msg = "Hellow Java Programing";
		System.out.println(msg);
		msg = msg.replace("Java", "C#");
		System.out.println(msg);
		
		
		
		
		
		
		
		
		
		
	}

	public static void juminNum(String num) {
		String year = num.substring(0,2);
		String month = num.substring(2, 4);
		String day = num.substring(4,6);
		String num2 = num.substring(7,8);
		
		int year1 = Integer.parseInt(year);
		int month1 = Integer.parseInt(month);
		int day1 = Integer.parseInt(day);
		int gender = Integer.parseInt(num2);
		
		
		 switch(gender) {
		  case 1: 
			  year1 += 1900;
			  System.out.println( year1 + "년 "+month1 + "월 " + day1 + "일 " + "남자 입니다.");
			 break;
		  case 2 : 
			  year1 += 1900;
			  System.out.println(year1 + "년 "+month1 + "월 " + day1 + "일 " + "여자 입니다.");
			  break;
		  case 3 :
			  year1 += 2000;
			  System.out.println(year1 + "년 "+month1 + "월 " + day1 + "일 " + "남자 입니다.");
			  break;
		  case 4 :
			  year1 += 2000;
			  System.out.println(year1 + "년 "+month1 + "월 " + day1 + "일 " + "여자 입니다.");
			  break;
		  default : System.out.println("국내인이 아닙니다.");
		 }
		
		
		
		
		
	}

}
