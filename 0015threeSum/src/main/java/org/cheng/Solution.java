package org.cheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和 标签：排序和双指针
 * 
 * @author lucheng
 *
 */
public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
			if (i > 0 && nums[i] == nums[i - 1])
				continue; // 去重
			int start = i + 1, end = nums.length - 1;
			while (start < end) {
				int sum = nums[i] + nums[start] + nums[end];
				if (sum > 0)
					end--;
				else if (sum < 0)
					start++;
				else {
					list.add(Arrays.asList(nums[i], nums[start], nums[end]));
					while (start < end && nums[start] == nums[start + 1])
						start++;
					while (start < end && nums[end] == nums[end - 1])
						end--;
					start++;
					end--;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		System.out.println(s.threeSum(nums));
	}
}
