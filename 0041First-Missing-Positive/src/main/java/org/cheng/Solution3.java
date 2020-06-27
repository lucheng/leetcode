package org.cheng;

/**
 * 缺失的第一个正数
 * 
 * @author lucheng
 *
 */
public class Solution3 {
	public int firstMissingPositive(int[] nums) {
		if(nums.length==0) {
			return 1;
		}
		for (int i = 0; i < nums.length; i++) {
			while (nums[i] > 0 && nums[i] < nums.length && nums[i] != i && nums[i] != nums[nums[i]]) {
				int temp = nums[i];
				nums[i] = nums[temp];
				nums[temp] = temp;
			}
		}

		for (int i = 1; i < nums.length; ++i) {
			if (nums[i] != i) {
				return i;
			}
		}
		return nums[0] == nums.length ? nums.length + 1 : nums.length;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] digits = new int[] { 3, 4,-1,1 };
		System.out.println(s.firstMissingPositive(digits));
	}
}
