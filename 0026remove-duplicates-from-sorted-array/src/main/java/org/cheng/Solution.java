package org.cheng;

public class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]) {
				nums[j++] = nums[i];
			}
		}
		return j;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 1, 1, 2 };
		int len = s.removeDuplicates(nums);
		for (int i = 0; i < len; i++) {
			System.out.print(nums[i]);
		}

	}
}
