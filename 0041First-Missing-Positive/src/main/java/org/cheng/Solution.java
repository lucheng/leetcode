package org.cheng;

import java.util.HashSet;
import java.util.Set;

/**
 * 缺失的第一个正数
 * 空间复杂度不符合条件
 * @author lucheng
 *
 */
public class Solution {
	public int firstMissingPositive(int[] nums) {
		Set<Integer> oldSet = new HashSet<>();
		int p = 1;
		for (int num : nums) {
			if (num >= p) {
				oldSet.add(num);
				while (oldSet.contains(p)) {
					p++;
				}
			}
		}
		return p;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] digits = new int[] { 7, 8, 9, 11, 12 };
		System.out.println(s.firstMissingPositive(digits));
	}
}
