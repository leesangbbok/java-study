package ex6;

class Computer {
	String   name = "PC";
	int        ram    = 32;
	double speed = 3.2;
	
	public void sound(){
		System.out.println("노래합니다.");
	}
	public void movie() {
		System.out.println("영화를 play합니다");
	}
	
} //Computer class end

public class ComputerTest {
	
	public static void main(String[] args) {
		
		Computer com1 = new Computer();
		com1.movie();
		System.out.println(com1.name);
		Computer com2 = new Computer();
		com2.sound();
		
	}
	
}
