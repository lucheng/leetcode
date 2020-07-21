package com.cheng;

/**
 * 插入排序
 * 
 * @author lucheng
 *
 */
public class InsertionSort {
	public int[] sort(int[] nums) {
		for (int j = 1; j < nums.length; j++) {
			int key = nums[j];
			int i = j - 1;
			while (i >= 0 && nums[i] > key) {
				nums[i + 1] = nums[i];
				i--;
			}
			nums[i + 1] = key;
		}
		return nums;
	}

	public static void main(String[] args) {
		InsertionSort s = new InsertionSort();
		int[] nums = { -3, 40, -4, 90, -5 };
		int[] ts = s.sort(nums);
		for (int i : ts) {
			System.out.print(i + ",");
		}
	}
}
