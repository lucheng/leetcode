package org.cheng;

/**
 * 无重复字符的最长子串
 * 
 * @author lucheng
 *
 */
public class Solution4 {
	public int longestSubarray(int[] nums) {
		int len = 0;
		int first = -1;
		int last = -1;
		boolean b = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				if(!b) {
					first = i;
					b = true;
				}else {
					last = i;
					len = Math.max(len, last - first - 1);
					first = i;
				}
			} 
		}
		return len;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] nums1 = { 1, 1, 1, 0, 1, 0, 1 };
		System.out.println(s.longestSubarray(nums1));
	}
}
