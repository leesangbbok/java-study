package collection01;

class Apple{}
class Banana{}

class Box{
	Object fruit;
}

class NewBox<Apple>{
	Apple f;
}
public class GenaricTest01 {

	public static void main(String[] args) {
		Box box = new Box();
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		box.fruit = "RedApple";
		
		NewBox nb = new NewBox();
		
		
	}

}
