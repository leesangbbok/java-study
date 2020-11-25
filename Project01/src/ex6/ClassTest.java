package ex6;

class OtherClass{
	void add(){
		int v1 = 7, v2 = 2;
		int v;
		v= v1+ v2;
		System.out.println(v1 + "+" +  v2 + "=" + v);
	}
}

public class ClassTest {

	public static void main(String[] args) {
		//변수 선언
		// 타입 변수명 = data;
		//  int  num  =  21;
		
		OtherClass oc = new  OtherClass();
		oc.add();
		
	} //mainMethod end
	
}//classTest end
