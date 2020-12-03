package ex04;

public class ArrayTest04 {
	//2 차원 배열
	public static void girlsDisp(String [][] g, int n) {
		for (int i = 0; i < g[n].length; i++) {
			System.out.print(g[n][i] + " ");
		}
		System.out.println();
	}
	public static void girlsDisp(String[][] girls) {
		for (int i = 0; i < girls.length; i++) {
			for (int j = 0; j < girls[i].length; j++) {
				System.out.printf("%-6s", girls[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		String [][] girls = new String [][] {
			// 0         1           2			3		 4			5			6		   7
			{"소녀시대 : ","윤아", "수영", "티파니", "효연", "유리", "태연", "써니", "서현"},       //0
			{"에이핑크 : ","박초롱", "윤보미", "정은지", "손나은", "김남주", "오하영", "홍유경"},  // 1
			{"AOA : ","유나", "혜정", "설현", "찬미"},														   //2 
			{"트와이스 : ", "사나", "모모", "정연", "쯔위", "다현","채연","나연", "지효","미나"}  //3
			
		};
		
		girlsDisp( girls , 3);
		System.out.println();
		girlsDisp( girls );
		
	}

	

}
