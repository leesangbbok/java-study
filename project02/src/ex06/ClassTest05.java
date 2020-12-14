package ex06;


//부모클래스! 밑에 택시와 버스, 트럭을 상속시켜준다.
//상속을 하는이유 
// 1. 중복된 객체변수, 메소드는 부모클래스로 정의해주고 자식클래스들은 부모클래스를 상속받아 쓸 수 있게 할려고
// 2. 다형성을 성립해야한다
/*
* 소나타와 엔진 이야기
* 햄버거와 더블햄버거 이야기
*/

class Vehicle{
	String model;
	
	public void run() {
		System.out.println(model + " (이)가 달린다");
	}
}

class Taxi extends Vehicle{
	public void nightRun() {
		System.out.println("밤에 영업한다");
	}
	
}//taxi End

class Bus extends Vehicle{
	public void dayRun() {
		System.out.println("낮에 영업한다");
	}
}//Bus End

class Truck extends Vehicle{	
	public void loading() {
		System.out.println("짐을 싣고 달린다");
	}
}//Truck end

public class ClassTest05 {

	public static void main(String[] args) {
		Vehicle ve = new Vehicle();
		Taxi t1 = new Taxi();
		t1.model = "벤츠택시";
		
		dispCar(t1);
		
	}

	private static void dispCar(Vehicle ve) {
		ve.run();
		if(ve instanceof Taxi) {
			((Taxi) ve ).nightRun();
		}
	}


}
