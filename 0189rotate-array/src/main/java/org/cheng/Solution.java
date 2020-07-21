package org.cheng;

/**
 * 旋转数组
 * 
 * @author lucheng
 */
public class Solution {
	public void rotate(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			int temp = nums[nums.length - 1];
			for (int j = nums.length - 1; j > 0; j--) {
				nums[j] = nums[j - 1];
			}
			nums[0] = temp;
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 3, 2, 2, 3 };
		s.rotate(nums, 3);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}

	}
}
