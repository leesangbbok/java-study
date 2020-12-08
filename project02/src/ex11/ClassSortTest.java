package ex11;

public class ClassSortTest {

	public static void main(String[] args) {
		//문자열 비교 (순서)
		String name1  = "이순신";
		String name2 = "이이";
		
		int result = name1.compareTo(name2);
		System.out.println(result);
		//result : 0 이면 같은 문자열
		
		String [] names = new String [] {
				"제니", "지수", "로제", "리사"
		};
		
		CustomSort.displayArray(names);
		CustomSort.bubble_sort(names);
		CustomSort.displayArray(names);
		
		System.out.println("===========================");
		//---------------------------------
		Student [] studs = new Student[] {
				new Student("이순신", "010-5234-5678", 2009),
				new Student("이이", "010-4757-0234", 2009),
				new Student("세종", "010-1214-5878", 2016),
				new Student("홍길동", "010-1124-9878", 2012),
				new Student("강감찬", "010-9854-5128", 2020)
		};
		CustomSort.displayArray(studs);
		System.out.println();
		CustomSort.bubble_sort(studs, 1); //1번이면 name , 2번이면  tel, 3번이면 year 
		CustomSort.displayArray(studs);
		
	}

}
