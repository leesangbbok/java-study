package ex9;

public class BitOperator {
	
	//��Ʈ������
	public static void main(String[] args) {
		// bit ������ :: �׷���ó�� �� �޸� ���� �Ҷ� ���δ�.
		// ��� �����͸� bit ������ �����Ѵ�.
		//����
		// ~(not) :: ��� bit�� 0�� 1�� ��ȯ, 1�� 0���� ��ȯ�Ѵ�.
		// &(and) :: �Ѵ� 1�̿��߸� 1 �� ���´�. /Ư�� bit ���� �����Ѵ� : bit masking
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
		
		
		//�̰� bit masking
		int c = 0x4B;
		int d = 0x08;
		if( (c & d) == 0) {
			System.out.println("Lan card ����");
		}else {
			System.out.println("Lan card ����");
		}
		
	}

}
