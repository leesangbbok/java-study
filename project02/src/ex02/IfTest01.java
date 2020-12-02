package ex02;

public class IfTest01 {
	
	
	
	public static void main(String[] args) {
		int point = 9410;
		String grade = "";
		
		if(point >= 9000) {
			grade = "관리자";
		}else {
			if(point >= 5000) {
				grade = "VIP";
			}else {
				if(point >= 2000) {
					grade = "회원";
				}else {
					if(point >= 1000) {
						grade = "준회원";
					}else {
						if(point == 0) {
							grade = "손님";
						}
					}
				}
			}
		}
		System.out.println("회원님의 등급은 " + grade + " 입니다.");
		System.out.println();
		
		switch(point / 1000) {
			case  9 : grade = "ADMIN";
			break;
			case  5 : grade = "VIP";
			break;
			case  2 : grade = "회원";
			break;
			case  1 : grade = "준회원";
			break;
			case  0 : grade = "손님";
			break;
		}
		System.out.println("회원님의 등급은 " + grade + " 입니다.");
		System.out.println();
		
		int total = 26;
		for (int i = 1; i <= total; i++) {
			System.out.print(i+ " ");
			if(i % 10 == 0) {
				System.out.println(" > ");
			}
			
		}
	}

}
