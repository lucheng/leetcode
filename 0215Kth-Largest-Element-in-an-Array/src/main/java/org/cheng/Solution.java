package org.cheng;

import java.util.Arrays;
/**
 * 快排
 * @author lucheng
 */
public class Solution {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { -3, 4, 3, 90 };
		System.out.println(s.findKthLargest(nums, 2));
	}
}
