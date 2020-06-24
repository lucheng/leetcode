package org.cheng;
/**
 * 最接近的三数之和
 * @author lucheng
 *
 */
public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		int res = Integer.MAX_VALUE;
		int s = -1;
		for (int x = 0; x < nums.length; x++) {
			for (int y = x + 1; y < nums.length - 1; y++) {
				for (int z = y + 1; z < nums.length; z++) {
					int sum = nums[x] + nums[y] + nums[z];
					if (sum - target == 0) {
						return sum;
					}else if (Math.abs(sum - target) < res) {
						s = sum;
						res = Math.abs(sum - target);
					}
				}
			}
		}
		return s;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 0,0,0 };
		int target = 1;
		System.out.println(s.threeSumClosest(nums, target));
	}
}
