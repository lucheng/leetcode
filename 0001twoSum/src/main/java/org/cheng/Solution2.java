package org.cheng;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				return new int[]{map.get(target - nums[i]),i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] nums = { -3, 4, 3, 90 };
		int target = 0;
		int[] ts = s.twoSum(nums, target);
		System.out.println(ts);
	}
}
