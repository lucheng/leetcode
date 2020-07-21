package org.cheng;

/**
 * 无重复字符的最长子串
 * 
 * @author lucheng
 *
 */
public class Solution3 {
	public double average(int[] salary) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < salary.length; i++) {
			max = Math.max(max, salary[i]);
			min = Math.min(min, salary[i]);
			sum += salary[i];
		}
		return (double)(sum - max - min) / (salary.length - 2);
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] nums1 = { 1, 2, 3, 4 };
		System.out.println(s.average(nums1));
	}
}
