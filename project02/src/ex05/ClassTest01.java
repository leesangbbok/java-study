package ex05;

class Animal{
	String name;
	int age;
	String color;
	
	public void info() {
		System.out.println("이 객체의 이름은 " + name + " 나이는 " + age + "살 " + color + "털을 가진 동물 입니다.");
	}
	
	public void sound(String sound) {
		System.out.println(name + " 는(은) " + sound +  "!! 하고 웁니다.");
	}
}

public class ClassTest01 {

	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.name = "뽀미";
		dog.age = 5;
		dog.color = "하얀";
		dog.sound("멍멍");
		
		dog.info();
	}

}
