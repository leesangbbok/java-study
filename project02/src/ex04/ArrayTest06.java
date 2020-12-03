package ex04;

public class ArrayTest06 {
	
	//2 차원 배열 jumsu[3][6]
	//국어 영어 수학 총점 평균 석차
	public static void main(String[] args) {
		int [][] jumsu =  new int[][] { 
			{80, 30,50, 0, 0, 0},
			{90, 80,40, 0, 0, 0},
			{70, 80,90, 0, 0, 0}
			
		}; 
		
		process(jumsu);
		System.out.println();
		rank(jumsu);
		System.out.println();
		output(jumsu);
		
	}
	//process
	public static void process (int [][] jumsu) {
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i][3] = jumsu[i][0] + jumsu[i][1] + jumsu[i][2];
			jumsu[i][4] = jumsu[i][3] /3 ;
			
		}
	}
	
	//석차 구하기
	public static void rank(int[][] jumsu) {
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i][5] = 1;
			for (int j = 0; j < jumsu.length; j++) {
				if(jumsu[i][3] < jumsu[j][3]) {
					jumsu[i][5]++;
				}else {
					jumsu[i][5] = jumsu[i][5];
				}
			}
		}
	}
	
	//output
	public static void output(int[][] jumsu) {
		for (int i = 0; i < jumsu.length; i++) {
			for (int j = 0; j < jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
