package org.cheng;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * 
 * @author lucheng
 */
public class Solution {
	public int findRepeatNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			while (nums[i] != i) {
				int temp = nums[i];
				if (nums[i] == nums[temp]) {
					return nums[i];
				}
				nums[i] = nums[temp];
				nums[temp] = temp;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] digits = new int[] {4,5,6,1,1,2,3};
		System.out.println(s.findRepeatNumber(digits));
	}
}
