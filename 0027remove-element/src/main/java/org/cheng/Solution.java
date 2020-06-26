package org.cheng;

/**
 * 移除元素
 * @author lucheng
 */
public class Solution {
	public int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return nums.length;
		}
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j++] = nums[i];
			}
		}
		return j;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 3, 2, 2, 3 };
		int len = s.removeElement(nums, 3);
		for (int i = 0; i < len; i++) {
			System.out.print(nums[i]);
		}

	}
}
