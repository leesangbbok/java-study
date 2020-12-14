package collection01;

import java.util.ArrayList;
import java.util.Collections;
class Car{}
public class ArrayListTest01 {
	
	
	

	public static void main(String[] args) {
		
		
		//실행중에 크기변경가능한 배열
		//ArrayList 에는 Object타입이라 모든형의 자료 입력가능
		//비추
		ArrayList al = new ArrayList();
		
		
		//add(Object obj);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		al.add("haha");
		al.add(3.14);
		al.add(new Car());
		
		
		// al.size() :: 리스트의 크기
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + " : " +al.get(i));
		}
		
		//값을 꺼낼 때 반드시 casting 필요
		Car newCar = (Car) al.get(6);
		System.out.println(newCar);

		
		//추천
		//제너릭 ( Generic ) = <Integer> class type만 가능  
		// <int> : error 
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(60);
		al2.add(40);
		al2.add(50);
		
		Collections.sort(al2);
		
		
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(i +" : " + al2.get(i));
		}
		
		//문자열 처리
		ArrayList<String> names = new ArrayList<String>();
		//ArrayList<String> names = new ArrayList<>(); 이렇게도 가능하지만  자바 1.7버전 이상만 사용 가능
		names .add("쯔위");
		names .add("정연");
		names .add("사나");
		names .add("나연");
		names .add("지효");
		
		listDisplay(names);
		names.add("모모"); // 추가
		listDisplay(names);
		names.remove(1); // 삭제
		names.set(2, "효리"); // index의 위치값의 이름 수정
		listDisplay(names);
		
		
	}

	private static void listDisplay(ArrayList<String> names) {
		for (int i = 0; i < names.size(); i++) {
			System.out.print( names.get(i));
			if (i < names.size() - 1) {
				System.out.print(",");				
			}
			
		}
		System.out.println();
	}

}
