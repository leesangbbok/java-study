package ex01;

import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		//���� Type �� ������ ���������� ��Ƴ��� ����
		//�迭�� ����� ������ �� ����. ������ �Լ��� �ø� ���� �ִ�
		// �迭�� �����ϴ� ��ȣ�� 0 ���� �����Ѵ�. 0,1,2,3...
		
		//�迭 ����
		String [] names = new String[3];
		
 		
		//�迭�ȿ� �� �Է�
		names[0] = "����";
		names[1] = "����";
		names[2] = "����";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		System.out.println();
		
		//for���� ����ؼ� �迭�ȿ� �ִ°����� ��� ȣ��
		//for (int i = 0; i < names.length; i++) {
		//	System.out.println(names[i]); 
		//}
		
		String [] blackPink = new String[] {"����", "����", "����", "����"};
		String [] blackPink2 = {"����", "����", "����", "����"};
		int count =blackPink.length; // �迭�� ���̸� int ������ ����
		
		//�̸��� �� �� �� ������ �������ִ� �Լ�.
		Arrays.sort(blackPink);
		
		for (int i = 0; i < count; i++) {
			System.out.println(blackPink[i]);
		}
		
		System.out.println();
		
		for(String name : blackPink2) {
			System.out.println(name);
		}
		
		System.out.println();
		
		//������ġã��
		for(int i = 0; i < count; i++) {
			if(blackPink[i].equals("����")) {
				System.out.println(blackPink[i]);
				break;
			}
		}
		
		System.out.println();
		
		//ã������� return int Ÿ������ �����ش�. //���� ���Ͼ����Ű���.
		int dd = Arrays.binarySearch(blackPink, "����");
		System.out.println("���� ��ġ��ȣ : " + dd);
		
		System.out.println();
		
		//�迭�� �����ϴ� ��� // �� �����Ұ� ����.
		int [] arrA = new int[] {8, 3, 2, 4, 9};
		int [] arrB = new int[5];
		
		arrB = Arrays.copyOf(arrA, arrA.length);
		
		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println();
		
		
		//================
		
		System.out.println("=======�׳� �غ��°�=======");
		int [] arrC = new int[] {3, 5, 4, 2 ,1};
		int [] arrD ; //���⿡ �迭�� �ϳ��� ����� ������ new int[] ��� ������
		
		arrD = arrC; // �̷����ϸ� ������ �ִ� �Ѱ� �迭�� ���� ���Եȴ�
		
		arrD[0] = 9;
		
		for (int i = 0; i < arrC.length; i++) {
			System.out.print(arrC[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < arrD.length; i++) {
			System.out.print(arrD[i] + ", ");
		}
	}			

}
