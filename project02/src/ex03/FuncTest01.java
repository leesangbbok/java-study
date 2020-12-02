package ex03;

class CalcWork{
	public int add (int a , int b) {
		int v = a + b;
		return v;
	}
	
	//가변인자 호출 :: 매개변수 여러개를 한번에 처리.
	public int addValues(int ... vals) {
		int sum = 0;
		for (int i = 0; i < vals.length; i++) { //vals는 자동으로 배열이 되어버림.
			sum += vals[i];
		}
		return sum;
	}
}

public class FuncTest01 {

	public static void main(String[] args) {
		CalcWork calcWork = new CalcWork();
		int v1, v2;
		v1 =123;
		v2 = 456;
		
		
		int result = calcWork.add(v1, v2);
		System.out.println(result);
		
		
		int sum1 = calcWork.addValues(4,5);
		System.out.println(sum1);
		
	}

}

// 함수 : function -> 프로그램의 조각
//return 문
// 1. 함수의 결과를 호출한 곳으로 돌려준다.
// 2. 실행한 함수를 중지 할때도 쓰인다.