package com.cheng;

/**
 * 选择排序
 * 
 * @author lucheng
 *
 */
public class SelectSort {
	public int[] sort(int[] nums) {
		for (int j = 0; j < nums.length; j++) {
			int min = j;
			for (int i = j + 1; i < nums.length; i++) {
				if (nums[i] < nums[min]) {
					min = i;
				}
			}
			
			if (min != j) {
				int temp = nums[j];
				nums[j] = nums[min];
				nums[min] = temp;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		SelectSort s = new SelectSort();
		int[] nums = { -3, 40, -4, 90 };
		int[] ts = s.sort(nums);
		for (int i : ts) {
			System.out.print(i + ",");
		}
	}
}
