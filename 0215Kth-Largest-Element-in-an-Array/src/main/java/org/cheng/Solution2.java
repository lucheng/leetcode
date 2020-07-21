package org.cheng;

import java.util.Arrays;

/**
 * 快排
 * 
 * @author lucheng
 */
public class Solution2 {
	public int findKthLargest(int[] nums, int k) {
		int low = 0;
		int high = nums.length - 1;
		int pivotkey = nums[0];
		while (low < high) {
			while (low < high && nums[high] >= pivotkey) {
				high--;
			}
		}
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] nums = { -3, 4, 3, 90 };
		System.out.println(s.findKthLargest(nums, 2));
	}
}
