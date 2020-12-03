package ex04;

public class ArrayTest03 {
	
	
	public static void main(String[] args) {
		//String [][] girls = new String [3][8];
		//girls[1][3] = "손나은";
		
		String [][] girls = new String [][] {
			// 0         1           2			3		 4			5			6		   7
			{"윤아", "수영", "티파니", "효연", "유리", "태연", "써니", "서현"},       //0
			{"박초롱", "윤보미", "정은지", "손나은", "김남주", "오하영", "홍유경"},  // 1
			{"유나", "혜정", "설현", "찬미"}													//2 
			
		};
		
		System.out.println(girls.length); 	   //row 3줄 
		System.out.println(girls[0].length); //0줄의 칸수 columns
		System.out.println(girls[1].length);  //1줄의 칸수 columns
		System.out.println(girls[2].length); //2줄의 칸수 columns
		
		System.out.println();
//		for (int j = 0; j < girls[2].length; j++) {
//			System.out.print(girls[2][j] + " ");
//		}
		//--------------------------------------------
		
		
		
	}

}
