package collection01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {	
		String[] arrStr = {"홍길동","이순신","김유신","박문수"};
		
		// ArrayList <- String[]
		//ArrayList<String> list1 = Arrays.asList(arrStr);
		List<String> list1 = Arrays.asList(arrStr);
		
		for (String name : list1) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(11, 5, 7, 3, 8); //이렇게도 값을 넣을 수 있다.
		
		for(Integer num : list2) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
