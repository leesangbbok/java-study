package ex9;

public class RepeatTest2 {

	public static void main(String[] args) {
		//이런 방법으로도 for문을 돌릴수 있음!//이렇게 쓰면 안돼
 		int i = 1;
		for( ;i<=5;) {
			System.out.println(i+". 화사");
			i++;
		}
		System.out.println();

		// do while문 ========================
		int k = 1;
		while(k < 5) {
			System.out.println(k + ". IU");
			k++;
		}
		
		System.out.println();
		int m = 1;
		do {
			System.out.println(m + ". mIU");
			m++;
		}while(m < 5);
		
	}

}
