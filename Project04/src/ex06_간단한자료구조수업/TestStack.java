package ex06_간단한자료구조수업;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		
		names.push("A");
		names.push("B");
		names.push("C");
		names.push("D");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}
		System.out.println();
		while(!names.isEmpty()) {
			String str = names.pop();
			System.out.println(str);
		}
	}

}
