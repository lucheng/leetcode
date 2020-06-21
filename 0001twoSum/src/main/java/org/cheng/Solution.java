package org.cheng;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					return new int[]{i,j};
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { -3, 4, 3, 90 };
		int target = 0;
		int[] ts = s.twoSum(nums, target);
		System.out.println(ts);
	}
}
