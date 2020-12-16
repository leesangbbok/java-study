package ex06_간단한자료구조수업;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>(); //추가, 삭제가 많을때만 사용! 
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 1; i <= 10000; i++) {
			list1.add(0, String.valueOf(i)); // 숫자를 글자로 바꿀때 함수 String.valueOf(i)
		}
		endTime   = System.nanoTime();
		System.out.println((endTime - startTime) / 1000 / 1000 + "초");
		
		startTime = System.nanoTime();
		for (int i = 1; i <= 10000; i++) {
			list2.add(0, String.valueOf(i)); 
		}
		endTime   = System.nanoTime();
		System.out.println((endTime - startTime) / 1000 / 1000 + "초");
	}

}
