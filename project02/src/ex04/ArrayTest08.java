package ex04;

import java.util.Arrays;

public class ArrayTest08 {
	
	public static void dataDisp(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
	//버블정렬하기
	public static void bublle_sort(int[] data, String option) {
		int tmp;
		if(option.equals("asc")) {
			for (int i = 0; i < data.length -1; i++) {
				for (int j = 0; j < data.length - 1 - i; j++) {
					if (data[j] > data[j + 1]) {
						tmp = data[j];
						data[j] = data[j + 1];
						data[j + 1] = tmp;
					}
				}
			}
		}
		if(option.equals("desc")) {
			for (int i = 0; i < data.length -1; i++) {
				for (int j = 0; j < data.length -1 - i; j++) {
					if (data[j] < data[j + 1]) {
						tmp = data[j];
						data[j] = data[j + 1];
						data[j + 1] = tmp;
					}
				}
			}
		}
	}
	
	//선택정렬하기
	public static void select_sort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i+1; j < data.length; j++) {
				if (data[i] > data[j]) {				//  > :: asc,  < :: desc 
					int tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] data = {10, 5, 7, 3, 4, 2, 11};
		
		dataDisp(data);
		bublle_sort(data, "asc");
		dataDisp(data);
//		select_sort(data);
//		dataDisp(data);
		
		
	}
	
}
