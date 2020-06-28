package org.cheng;
/*
 * 长度最小的子数组
 */
public class Solution {

	public int minSubArrayLen(int s, int[] nums) {
		int start = 0;
		int sum = 0;
		int len = nums.length + 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= s) {
				return 1;
			}

			sum += nums[i];
			while (sum >= s) {
				len = Math.min(len, i - start + 1);
				sum -= nums[start++];
			}
		}
		return len == nums.length + 1 ? 0 : len;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 2,3,1,2,4,3 };
		int target = 7;
		int ts = s.minSubArrayLen(target, nums);
		System.out.println(ts);
	}
}
