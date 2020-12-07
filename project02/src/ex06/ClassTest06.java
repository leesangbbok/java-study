package ex06;

//상속02
class Animal{
	String name;
	
	public void eat(String food) {
		System.out.println(name + "(이)가 " + food + " (을)를 먹어요");
	}
	
}
class Dog2 extends Animal{
	
	public void sound() {
		System.out.println(name + " (이)가 멍멍");
	}
	
	
}

class Cat2 extends Animal{
	public void sound() {
		System.out.println(name + " (이)가 야옹");
	}
}
public class ClassTest06 {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog2 dog = new Dog2();
		disp(dog);
		
		System.out.println();
		
		Cat2 cat = new Cat2();
		disp(cat);
		
		dispPet(cat);
		
		
		
		
	}
	
	//둘다 같은부모를 상속 받았을때 사용 가능
	private static void dispPet(Animal animal) {
		System.out.println("=====================");
		animal.eat("사료");
		if(animal instanceof Dog2) {
			((Dog2) animal).sound();
		}
		if(animal instanceof Cat2) {
			((Cat2) animal).sound();
		}
	}

	private static void disp(Cat2 cat) {
		cat.name = "나비";
		cat.eat("츄르");
		cat.sound();
		
	}

	private static void disp(Dog2 dog) {
		dog.name = "바둑이";
		dog.eat("개껌");
		dog.sound();
	}


}
