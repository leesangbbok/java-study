package ex9;

public class SumTest {
	
	public static void main(String[] args) {
		
		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		//1+3+5+ ... + 99
//		sum = 0;
//		int j = -1;
//		for(int i = 1; i <= 50; i++) {
//			j = j +2;
//			sum = sum +j;
//			System.out.println(sum);
//		}
		System.out.println("2+4+6+8+ ... 100");
		sum = 0;
		int j = 0;
		for(int i = 2; i <= 100; i+=2) {
			//j =j +2;
			sum = sum+i;
		}
		System.out.println("1锅 规过"+j +", "+ sum);
		
		sum = 0;
		for(int jj = 2; jj <=100; jj = jj+2) {
			sum =sum + jj;
		}
		System.out.println("2锅规过 "+sum);
		
		sum = 0;
		for (int i = 0; i <= 100; i++) {
			if(i  % 2 == 0) {
				sum = sum+i;
			}
		}
		System.out.println("3锅 规过 "+sum);
		
		
		System.out.println();
		System.out.println("1+2+4=8+16+...醚 30锅拌魂");
		sum = 0;
		for(int i = 1; i <= 30;  i++) {
			j = (int) Math.pow( 2, (double) (i-1));
			sum = sum + j;
		}
		System.out.println("1锅规过 " + sum);
		
		sum = 0;
		j = 1;
		for(int i = 1; i < 30;  i++) {
			j = j*2;
			sum += j;
		}
		sum = sum +1;
		System.out.println("2锅 规过 " + sum);
		System.out.println();
		//1+1+2+1+2+3+1+2+3+4+1+2+3+4+5
		sum = 0;
		j = 0;
		for(int i = 1; i <= 5; i++) {
			j= j + i;
			sum += j;
		}
		System.out.println(sum);
		System.out.println();
		
		sum = 0;
		j = 1;
		int j1   =  1;
		int j2  =  0;
		for(int i = 1; i <= 30; i++) {
			j   = j1 + j2;
			j2 = j1;
			j1  = j;
			sum += j;
		}
		System.out.println(sum);
	}
	
}
