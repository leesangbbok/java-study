package ex6;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class WrapperClassTest {

	public static void main(String[] args) {
		int age = 32;
		int num1 = 2147483647;
		
		System.out.println(num1);
		
		System.out.println(Integer.MAX_VALUE);
		
		
		int val1 = 123;
		int val2;
		//Integer iVal1 = 123;
		Integer iVal1 = new Integer(val1); //boxing
		System.out.println(iVal1);
		
		val2 = iVal1.intValue(); //unboxing
		
		//<> : 안에는 무조건 Class 여야하므로 Integer 사용 
		ArrayList<Integer> al = new ArrayList<Integer>();
		
	}

}
