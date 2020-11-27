package ex01;

import java.util.Arrays;

public class ArrayTest02 {
	
	public static void nums_disp(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] nums = new int[] {3, 5, 7, 6, 4};
		
		nums_disp(nums);
		Arrays.sort(nums);
		
		//call by referance
		nums_disp(nums);
		
		
	}

}
