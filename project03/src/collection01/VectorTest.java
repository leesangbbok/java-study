package collection01;

import java.util.Vector;

public class VectorTest {
	
	//Vector는  ArrayList의 thread Safe 버전
	//thread : 프로그램의 실행의 흐름
	//multi thread : 한번에 여러가지 동작을 실행
	//쓰레드를 사용할때는 Vector 리스트로 사용한다.
	//스윙은 쓰레드를 많이 사용하기 때문에 벡터리스트를 사용하자. 이유 : 데이터를 안전하게 하기위해
	public static void main(String[] args) {
		Vector<String> names = new Vector<>();
		
		names.add("토르");
		names.add("아이언맨");
		names.add("헐크");
		names.add("스파이더맨");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		
	}

}
