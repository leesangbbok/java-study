package ex04;

public class ArrayTest07 {
	static int k = 0; // 필드, 전역변수 - 만들어진 위치 이후로는 어디든 사용 할 수 있다.
	
	//call by value :: 일반 변수는 바뀌지 않는다 , 일반 변수는 변수공간을 공유하지 않는다!
	public static void func1(int a) {
		 a = 123;
		 System.out.println(a);
	}
	//call by reference :: 배열은 변수공간을 공유함!
	public static void func2(int[] brr) {
		brr[1] = 1234;
		System.out.println(brr[1]);
	}
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		func1(a);
		System.out.println(a);
		System.out.println("============================");
		
		int[] arr = {1,2,3};
		System.out.println(arr[1]);
		func2(arr);
		System.out.println(arr[1]);
	}

}
