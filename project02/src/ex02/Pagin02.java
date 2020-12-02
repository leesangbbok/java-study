package ex02;

public class Pagin02 {

	/*
	 *  %c : char
	 *  %d : declmal  10진정수
	 *  %o : octa decimal : 8진수
	 *  %x : hexa decimal : 8진수
	 *  %f : 실수  (float, double)
	 *  %s : String
	 *  
	 *  %-10s : 전체 10자리로 출력 // - 왼쪽으로 붙여서 출력
	 * */
	public static void main(String[] args) {
		int countPerLine = 10; //한줄에 출력할 갯수
		int total               = 26;
		int curPage         = 21;     //현재 페이지
		
		//시작하는곳
		int  start = (curPage - 1 ) / countPerLine * countPerLine + 1 ;
		
		//페이지 끝나는곳
		int end = start + (countPerLine - 1);
		
		if(start > 1) {
			System.out.print(" < ");
		}
		int i = 0;
		for ( i = start; i <= end; i++) {
			if(i > total) {
				break;
			}
			System.out.printf(" %3d ", i);
		}
		if(i < total) {
			System.out.print(" > ");
		}
	}

}
