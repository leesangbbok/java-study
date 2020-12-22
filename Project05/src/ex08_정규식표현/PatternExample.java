package ex08_정규식표현;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		// \d            : 숫자, {3,4} : 3자리 또는 4자리 
		// [abc]         : 한자리 단어 a 또는 b 또는 c 만 가능하다.
		// [a-z]         : [] 한 문자, a ~ z 까지
		// [a-zA-Z]  : [] 한 문자, a ~ z 까지 A~Z : 모든 영문자
		// [^abc]        : a b c 빼고 나머지 문자만 가능 
		
		// \s			 :  공백(space)
		// \w			 :  한개의 알파벳 또는 한 개의 숫자 [a-zA-Z0-9]
		// ?				 :  없음 또는 한 개
		// *				 :  없음 또는 한 개 이상
		// + 				 :  한개 이상
		// {n}			 :   n값에 따라 길이 지정 ex) ㅜ = 4 라면 4자리만 허용
		// {n, m}		 :   n개에서부터 m 개까지  ex) 3,4  3자리에서 4자리까지 허용 
		// ()				 :  그룹핑
		
		//주민번호, 사업자등록번호, 전화번호, 이메일
		
		
		//휴대폰번호 정규식표현
		String  regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data      =  "010-2111-4577";
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		//e-mail 정규식표현
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data      = "angel@naver.co.kr";
		result   = Pattern.matches(regExp, data);
		System.out.println(result);
		
		
	}

}
