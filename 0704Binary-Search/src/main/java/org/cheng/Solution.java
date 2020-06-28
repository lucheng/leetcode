package org.cheng;

/*
 * 二分查找
 */
public class Solution {

	public int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else if (nums[mid] < target) {
				left = mid + 1;
			}
		}
		return nums[left] == target ? left : -1;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 1, 3, 5, 6 };
		int target =6;
		int ts = s.search(nums, target);
		System.out.println(ts);
	}
}
