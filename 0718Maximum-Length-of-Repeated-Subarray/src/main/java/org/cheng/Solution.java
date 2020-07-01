package org.cheng;
/**
 * 最长重复子数组
 * @author lucheng
 *
 */
public class Solution {
	public int findLength(int[] A, int[] B) {
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				int k = 0;
				while (i + k < A.length && j + k < B.length && A[i + k] == B[j + k]) {
					k++;
				}
				ans = Math.max(ans, k);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = { 1, 2, 3, 2, 1 };
		int[] B = { 3, 2, 1, 4, 7 };
		System.out.println(s.findLength(A, B));
	}
}
