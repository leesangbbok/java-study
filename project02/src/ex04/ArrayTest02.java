package ex04;

public class ArrayTest02 {
	//1 차원 배열
	public static int getSum(int [] sc) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += sc[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int [] scores = new int[] {89, 78, 90, 100, 56};
		
		System.out.println(getSum(scores));
		System.out.println(getSum(scores)/5);
		
	}

}
