package ex06;

 class Dog{
	String name;
	
	void eat(String food) {
		System.out.println(name + " 가 " + food + " 먹습니다");
	}
	void sound () {
		System.out.println("멍멍");
	}
}

public class ClassTest01 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "뽀미";
		dog.sound();
		dog.eat("육포");

	}

}
