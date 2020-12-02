package ex02;

public class Pagin01 {
	
	public static void main(String[] args) {
		int countPerLine = 10;
		int total               = 26;
		int curPage         = 22;
		
		//시작하는곳
		int  start = (curPage - 1 ) / countPerLine * countPerLine + 1 ;
		
		//페이지 끝나는곳
		int end = start + (countPerLine - 1);
		
		
		for (int i =start; i <= end; i++) {
			if(i % countPerLine == 1) {
				if(i == 1) {
					System.out.println("    ");
				}else {
					System.out.print(" < ");
				}
			}
			System.out.printf("%2d  ", i);
			if(i % countPerLine == 0) {
				System.out.print(" > \n");
			}
		}
	}
	
}
