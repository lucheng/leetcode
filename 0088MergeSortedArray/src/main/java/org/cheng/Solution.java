package org.cheng;

/**
 * 合并两个有序数组
 * 
 * @author lucheng
 *
 */
public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] nums = new int[m + n];
		int m1 = 0, n1 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (m1 < m && n1 < n) {
				if (nums1[m1] < nums2[n1]) {
					nums[i] = nums1[m1];
					m1++;
				} else {
					nums[i] = nums2[n1];
					n1++;
				}
			} else if (m1 >= m) {
				nums[i] = nums2[n1];
				n1++;
			}else {
				nums[i] = nums1[m1];
				m1++;
			}
		}
		
		for(int i = 0; i < nums1.length; i++) {
			nums1[i] = nums[i];
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int n = nums2.length;
		int m = nums1.length - n;
		s.merge(nums1, m, nums2, n);
		for(int i:nums1) {
			System.out.print(i);
		}
		
	}
}
