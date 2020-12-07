package ex06;

class NewDog{
	 String name;
	
	void eat(String food) {
		System.out.println(name + " 가 " + food + " 먹습니다");
	}
	void sound () {
		System.out.println(name + " (이)가 멍멍");
	}
}

public class ClassTest02 {

	public static void main(String[] args) {
		NewDog dog1 = new NewDog();
		NewDog dog2 = new NewDog();
		
		dog1.name = "티키";
		dog2.name = "타카";
		dog1.sound();
		
		//객체 배열
		NewDog []  nDogs = new NewDog[5];
		
		for (int i = 0; i < nDogs.length; i++) {
			nDogs [i] = new NewDog();
		}
		
		String [] names = {"티키", "타카", "왈가", "왈부", "뿡"};
		for (int i = 0; i < nDogs.length; i++) {
			nDogs[i].name = names[i];
		}
		
//		nDogs[0].name = "티키";
//		nDogs[1].name = "타카";
//		nDogs[2].name = "왈가";
//		nDogs[3].name = "왈부";
//		nDogs[4].name = "뿡";
		
		for (int i = 0; i < nDogs.length; i++) {
			nDogs[i].sound();
		}
		
		System.out.println("=========================================");
		
		//객체 배열 생성시 초기화
		NewDog [] dogs2 = new NewDog[] {
				new  NewDog(),
				new  NewDog(),
				new  NewDog(),
				new  NewDog(),
				new  NewDog()
		};
		
		for (int i = 0; i < dogs2.length; i++) {
			dogs2[i].name = names[i];
		}
		
		for (int i = 0; i < dogs2.length; i++) {
			dogs2[i].sound();
		}
	}

}
