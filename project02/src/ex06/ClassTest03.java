package ex06;

class Cat{
	String name;
	String color;
	
	void sound() {
		System.out.println(color+"색 "+ name + " (이)가 야옹~");
	}
	
}
class NewCat{
	private String name;
	private String color;
	
	void sound() {
		System.out.println(color+"색 "+ name + " (이)가 야옹~");
	}
	
}
public class ClassTest03 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.name = "미호";
		cat.color = "하얀";
		cat.sound();
	}

}
