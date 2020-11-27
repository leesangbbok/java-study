package ex9;

public class BitOperator {
	
	//비트연산자
	public static void main(String[] args) {
		// bit 연산자 :: 그래픽처리 나 메모리 조작 할때 쓰인다.
		// 모든 데이터를 bit 단위로 연산한다.
		//종류
		// ~(not) :: 모든 bit의 0은 1로 변환, 1은 0으로 변환한다.
		// &(and) :: 둘다 1이여야만 1 로 나온다. /특정 bit 값을 추출한다 : bit masking
		// ^(xor)
		// ||(or)
		// << (shift)
		// >> (shift)
		// >>> (shift)
		
		int a = 3;
		int b ;
		b = ~a;
		System.out.println("a= " + a);
		System.out.println("b= " + ~a);
		
		
		//이게 bit masking
		int c = 0x4B;
		int d = 0x08;
		if( (c & d) == 0) {
			System.out.println("Lan card 없음");
		}else {
			System.out.println("Lan card 있음");
		}
		
	}

}
