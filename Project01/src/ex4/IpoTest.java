package ex4;

class Ipo{
	
	public  static int input(){
		System.out.println("�Է�");
		return 0;
	}
	public static void process() {
		System.out.println("ó��");
	}
	public static void output() {
		System.out.println("���");
	}
}
class Ipo2{
	public  int input(){
		System.out.println("�Է�");
		return 0;
	}
	public  void process() {
		System.out.println("ó��");
	}
	public  void output() {
		System.out.println("���");
	}
}
public class IpoTest {
	
	public static void main(String[] args) {
		
		Ipo.input();
		Ipo.process();
		Ipo.output();
		
		System.out.println();
		
		// static ���� �Լ����� �ٷ� ����� �� �ְ�, static �� ���� �Լ����� new (�ν��Ͻ�ȭ)�� ���� ���ο� ������ �־ �Լ����� ��� �� �� �ִ�.
		
		Ipo2 ipo2 = new Ipo2();
		ipo2.input();
		ipo2.process();
		ipo2.output();
		
	}
}
