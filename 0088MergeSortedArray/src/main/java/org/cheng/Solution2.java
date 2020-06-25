package org.cheng;

/**
 * 合并两个有序数组
 * 
 * 双指针 / 从后往前
 * 
 * @author lucheng
 *
 */
public class Solution2 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		m--;
		n--;
		for (int i = nums1.length; i > 0; i--) {
			if (n < 0 || (m >= 0 && nums1[m] >= nums2[n])) {
				nums1[i - 1] = nums1[m--];
			} else {
				nums1[i - 1] = nums2[n--];
			}
		}
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
//		int[] nums1 = { 0 };
//		int[] nums2 = { 1 };
//		int[] nums1 = { 2, 0 };
//		int[] nums2 = { 1 };
		int n = nums2.length;
		int m = nums1.length - n;
		s.merge(nums1, m, nums2, n);
		for (int i : nums1) {
			System.out.print(i);
		}

	}
}
