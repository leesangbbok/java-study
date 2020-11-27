package ex01;

import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		//같은 Type 의 변수를 연속적으로 모아놓은 모음
		//배열은 사이즈를 변경할 수 없다. 하지만 함수로 늘릴 수는 있다
		// 배열은 시작하는 번호가 0 부터 시작한다. 0,1,2,3...
		
		//배열 선언
		String [] names = new String[3];
		
 		
		//배열안에 값 입력
		names[0] = "리사";
		names[1] = "제니";
		names[2] = "지수";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		System.out.println();
		
		//for문을 사용해서 배열안에 있는값들을 모두 호출
		//for (int i = 0; i < names.length; i++) {
		//	System.out.println(names[i]); 
		//}
		
		String [] blackPink = new String[] {"지수", "제니", "로제", "리사"};
		String [] blackPink2 = {"지수", "제니", "로제", "리사"};
		int count =blackPink.length; // 배열의 길이를 int 변수에 담음
		
		//이름을 가 나 다 순으로 정렬해주는 함수.
		Arrays.sort(blackPink);
		
		for (int i = 0; i < count; i++) {
			System.out.println(blackPink[i]);
		}
		
		System.out.println();
		
		for(String name : blackPink2) {
			System.out.println(name);
		}
		
		System.out.println();
		
		//로제위치찾기
		for(int i = 0; i < count; i++) {
			if(blackPink[i].equals("로제")) {
				System.out.println(blackPink[i]);
				break;
			}
		}
		
		System.out.println();
		
		//찾은결과를 return int 타입으로 돌려준다. //별로 쓸일없을거같음.
		int dd = Arrays.binarySearch(blackPink, "제니");
		System.out.println("제니 위치번호 : " + dd);
		
		System.out.println();
		
		//배열을 복사하는 방법 // 음 쓸만할거 같다.
		int [] arrA = new int[] {8, 3, 2, 4, 9};
		int [] arrB = new int[5];
		
		arrB = Arrays.copyOf(arrA, arrA.length);
		
		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println();
		
		
		//================
		
		System.out.println("=======그냥 해보는거=======");
		int [] arrC = new int[] {3, 5, 4, 2 ,1};
		int [] arrD ; //여기에 배열을 하나더 만들고 싶으면 new int[] 라고 해주자
		
		arrD = arrC; // 이렇게하면 기존에 있던 한개 배열을 같이 쓰게된다
		
		arrD[0] = 9;
		
		for (int i = 0; i < arrC.length; i++) {
			System.out.print(arrC[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < arrD.length; i++) {
			System.out.print(arrD[i] + ", ");
		}
	}			

}
