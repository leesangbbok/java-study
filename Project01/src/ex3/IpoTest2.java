package ex3;

class Ipo{
	public static void title() {
		System.out.println("IpoTest2");		
	}
	public static void input() {
		System.out.println("input");
	}
	public static void process() {
		System.out.println("process");
	}
	public static void output() {
		System.out.println("output");
	}
	public static void line() {
		System.out.println("====================");
	}
}


public class IpoTest2 {
	
	public static void main(String[] args) {
		Ipo.line();
		Ipo.title();
		Ipo.line();
		Ipo.input();
		Ipo.line();
		Ipo.process();
		Ipo.line();
		Ipo.output();
		Ipo.line();
		
	}
}
