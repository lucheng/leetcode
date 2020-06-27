package org.cheng;

/**
 * 缺失的第一个正数
 * 
 * @author lucheng
 *
 */
public class Solution2 {
	public int firstMissingPositive(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != i + 1 && nums[i] != nums[nums[i]-1]) {
				int temp = nums[i];
				nums[i] = nums[temp - 1];
				nums[temp - 1] = temp;
			}
		}

		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}
		return nums.length + 1;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] digits = new int[] { 2, 1 };
		System.out.println(s.firstMissingPositive(digits));
	}
}
