package ex4;

class Ipo{
	
	public  static int input(){
		System.out.println("입력");
		return 0;
	}
	public static void process() {
		System.out.println("처리");
	}
	public static void output() {
		System.out.println("출력");
	}
}
class Ipo2{
	public  int input(){
		System.out.println("입력");
		return 0;
	}
	public  void process() {
		System.out.println("처리");
	}
	public  void output() {
		System.out.println("출력");
	}
}
public class IpoTest {
	
	public static void main(String[] args) {
		
		Ipo.input();
		Ipo.process();
		Ipo.output();
		
		System.out.println();
		
		// static 붙은 함수들은 바로 사용할 수 있고, static 이 붙은 함수들은 new (인스턴스화)를 시켜 새로운 변수명에 넣어서 함수들을 사용 할 수 있다.
		
		Ipo2 ipo2 = new Ipo2();
		ipo2.input();
		ipo2.process();
		ipo2.output();
		
	}
}
