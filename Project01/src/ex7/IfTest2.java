package ex7;

public class IfTest2 {

	public static void main(String[] args) {
		//오전 시간 < 12 
		//정오 시간 == 12
		//오후 시간 > 12 
		
		int time = 12; 
		
		if(time > 12) {
			System.out.println("오후");
		}else if(time < 12) {
			System.out.println("오전");
		}else if(time == 12){
			System.out.println("정오");
		}
		
		
		
		
	}

}
