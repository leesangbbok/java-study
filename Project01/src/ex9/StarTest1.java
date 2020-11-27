package ex9;

class Star{
	//star1 함수
	public void star1() {
		System.out.println("* * * * *");
		System.out.println("* * * * *");
		System.out.println("* * * * *");
		System.out.println("* * * * *");
		System.out.println("* * * * *");
	}
	
	//star2 함수
	public void star2() {
		for(int i = 1; i <=5; i++) {
			System.out.println("* * * * *");
		}
	}
	
	//star3 함수
	public void star3() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("* * * * *");
			System.out.println("");
		}
	}
	
	//star4 함수
		public void star4() {
			for (int i = 1; i <= 5; i++) { //세로 행
				for (int j = 1; j <= 5; j++) { //가로 열
					System.out.print(" * ");
				}
				System.out.println("");
			}
		}
}

public class StarTest1 {

	public static void main(String[] args) {
		//별찍기
		Star st = new Star();
		System.out.println("1");
		st.star1();
		System.out.println("2");
		st.star2();
		System.out.println("3");
		st.star3();
		System.out.println("4");
		st.star4();
	}

}
