package ex6;

public class RelativeOperator {

	public static void main(String[] args) {
		
		boolean b1 = (3 == 3.0);
		System.out.println(b1);
		boolean b2 = (3 > 3.0);
		System.out.println(b2);
		boolean b3 = ('A' == 'a');
		System.out.println(b3);
		
		//문자열 비교는 == 사용하면 안됨.
		//boolean b4 = ("이순신" == "이순신");
		//System.out.println(b4);
		
		String name1 = "이신";
		String name2 = "이신";
		boolean b5 = (name1.equals(name2));
		System.out.println(b5);
		
		int n1 = name1.compareTo(name2); //0 이면 == , -숫자나오면 앞이 크다
		System.out.println(n1);
		
		
		
	}

}
