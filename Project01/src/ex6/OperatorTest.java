package ex6;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		int v1, v2;
		int v;
		
		//첫번째 숫자 입력 받기
		System.out.println("숫자 기입해주세요1.");
		String  v1Str = in.nextLine();
		v1 = Integer. parseInt(v1Str); // String을 int로 변환하는법!
		
		//두번째 숫자 입력 받기
		System.out.println("숫자 기입해주세요2.");
		String  v2Str = in.nextLine();
		v2 = Integer. parseInt(v2Str);
		
		if(v2 == 0) {
			System.out.println("v2는 0을 입력 할 수 없습니다.\n 다시 실행 해주세요!");
			System.exit(-1); //프로그램을 끝내는법! / -1 은 컴퓨터에서는 에러로 인식함.
		}
		
		System.out.println();
		v = v1 + v2;
		System.out.println(v1Str + " + " + v2Str + "= " + v);
		v = v1 - v2;
		System.out.println(v1Str + " - " + v2Str + "= " + v);
		v= v1 * v2;
		System.out.println(v1Str + " x " + v2Str + "= " + v);
		v= v1 / v2;
		System.out.println(v1Str + " / " + v2Str + "= " + v);
		v= v1 % v2;
		System.out.println(v1Str + " % " + v2Str + "= " + v);
		System.out.println("계산 끝");
		in.close();
	}

}
