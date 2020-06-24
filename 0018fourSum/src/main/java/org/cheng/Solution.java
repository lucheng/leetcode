package org.cheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和 标签：排序和双指针
 * 
 * @author lucheng
 *
 */
public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length - 3; i++) {
			if (nums[i] > target && nums[i] > 0)
				break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
			if (i > 0 && nums[i] == nums[i - 1])
				continue; // 去重

			for (int j = i + 1; j < nums.length - 2; j++) {

				if (nums[j] > target - nums[i] && nums[j] > 0)
					break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue; // 去重

				int start = j + 1, end = nums.length - 1;
				while (start < end) {
					int sum = nums[i] + nums[j] + nums[start] + nums[end];
					if (sum > target)
						end--;
					else if (sum < target)
						start++;
					else {
						list.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
						while (start < end && nums[start] == nums[start + 1])
							start++;
						while (start < end && nums[end] == nums[end - 1])
							end--;
						start++;
						end--;
					}
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
//		int[] nums = { 1, 0, -1, 0, -2, 2 };
//		int[] nums = { -3, -2, -1, 0, 0, 1, 2, 3 };
//		int[] nums = { -1,0,1,2,-1,-4};
//		int[] nums = { 0,0,0,0};
//		int target = 0;
		int[] nums = { 1, -2, -5, -4, -3, 3, 3, 5 };
		int target = -11;
		System.out.println(s.fourSum(nums, target));
	}
}
