package org.cheng;

/**
 * 无重复字符的最长子串
 * 
 * @author lucheng
 *
 */
public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len = nums1.length + nums2.length;
		int left = 0;
		int right = nums2.length;
		left = nums1.length % 2 == 0 ? nums1.length / 2 : (nums1.length + 1) / 2;
		right = nums2.length % 2 == 0 ? nums2.length / 2 : (nums2.length + 1) / 2;
		System.out.println(left);
		System.out.println(right);
//		while (left < right) {
//
//		}
		return 0;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums1 = { 1, 2, 3, 4 };
		int[] nums2 = { 2, 3, 4, 5, 6 };
		System.out.println(s.findMedianSortedArrays(nums1, nums2));
	}
}
