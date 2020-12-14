package collection03;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	
	// Set : 집합 - interface라서 인스턴스화 하지 못한다.
	// 1. 중복데이터를 허용하지 않는다.
	// 2. 입력순서가 유지 되지 않는다.
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		System.out.println(set.size());
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA");  //중복이라 입력이 안됨  :: Set자료구조의 장점 
		set.add("Mybatis");
		
		System.out.println(set.size());
		
		setDisplay(set);
		
		set.clear();
		System.out.println("자료 모두 지우기!!!!!!!!!!!!!");
		System.out.println("자료 지워졌나? " + set.isEmpty());
	}

	private static void setDisplay(HashSet<String> set) {
		//set 자료구조는 반복하는 index 가 없다.
		//그래서 for문이 안됨
		//Iterator : 반복자
		
		Iterator<String> iter = set.iterator(); //set 자료구조는 이렇게 호출 시킬 수 있다. for문 X
		while (iter.hasNext()) { 				//현재 자료가 있냐? 라고 물어보는것 : hasNext()
			String element = iter.next(); 		// 현재자료를 가져오고 반복자를 이동시킨다
			
			System.out.print(element + " ");
		}
		System.out.println();
		
		
		//자동완성 할 수 있음 for에 세 번째 Iterator over collection
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String element = (String) iterator.next();
			System.out.print(element + " ");
		}
	}

}
