package ex04;

public class ArrayTest01 {
	//1 차원 배열
	public static void main(String[] args) {
		String name01 = "윤아";
		String name02 = "수영";
		String name03  = "티파니";
		String name04 = "효연";
		String name05 = "유리";
		String name06 = "태연";
		String name07 = "써니";
		String name08 = "서현";
		
		//----------------------------------
		
		String [] names = new String[8];
		names[0] = "윤아";
		names[1] = "수영";
		names[2] = "티파니";
		names[3] = "";					// 빈 문자열이면 공백으로 표시
		names[4] = "유리";
		//names[5] = "태연";		// 값이 들어가지 않으면 null !!
		names[6] = "써니";
		names[7] = "서현";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		//----------------------------
		String [] sosis = new String [] {"윤아", "수영", "티파니", "효연", "유리", "태연", "써니", "서현"};
		
		for (int i = 0; i < sosis.length; i++) {
			System.out.println(sosis[i]);
		}
		
	}
	
}
