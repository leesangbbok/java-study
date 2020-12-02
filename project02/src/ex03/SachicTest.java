package ex03;

class Sachic {
	
	public int add (int a, int b) {
		return a + b;
	}
	
	public int sub (int a, int b) {
		return a - b;
	}
	
	public int mul (int a, int b) {
		return a * b;
	}
	
//	public int div (int a, int b) {
//		if(b == 0 ) {return 0;}
//		return a / b;
//	}
	
	public int div(int a, int b) {
		//예외처리
		try {
			int v ;
			v = a / b;
			return v;
		} catch (Exception e) {
			System.out.print("예외 발생 : ");
			return 0;
		}
		
	}
}

public class SachicTest {

	public static void main(String[] args) {
		Sachic sa = new Sachic();
		
		int result1 = sa.add(6, 3);
		System.out.println(result1);
		int result2 = sa.sub(6, 3);
		System.out.println(result2);
		int result3 = sa.mul(6, 3);
		System.out.println(result3);
		int result4 = sa.div(6, 0);
		System.out.println(result4);
		
	}

}
