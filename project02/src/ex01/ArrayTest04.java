package ex01;

import java.util.Scanner;

class SungjukP{
	final static int N = 3;
	//�������� ����ó�� ���α׷�
	Scanner sc = new Scanner(System.in);
	
	//���
	String [] names = new String[3];
	
	//����
	int [] kor = new int[N];
	int [] eng = new int[N];
	int [] mat = new int[N];
	int [] tot = new int[N];
	int [] avg = new int[N];
	
	public void getInput() {
		System.out.println("�̸�, ����, ����, ���� �� �Է��ϼ���.");
		for (int i = 0; i <N; i++) {
			String instr = sc.nextLine();
			String [] vals = instr.split(","); // �迭�� ���� ������ split ���� ¥����.
			
			names[i] = vals[0];
			
			kor[i] = Integer.parseInt(vals[1]);
			eng[i] = Integer.parseInt(vals[2]);
			mat[i] = Integer.parseInt(vals[3]);
		}
	}
	
	public void getOutput() {
		for (int i = 0; i < N; i++) {
			//���
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = (int) (tot[i] / 3.0 + 0.5);
		}
		for (int i = 0; i < avg.length; i++) {
			System.out.printf("%-10s %3d %3d %3d %3d %3d \n", names[i], kor[i], eng[i], mat[i], tot[i], avg[i] );
			
		}
	}

}

public class ArrayTest04 {

	public static void main(String[] args) {
		SungjukP sp = new SungjukP();
		
		sp.getInput();
		sp.getOutput();
		
		
		}
	}


