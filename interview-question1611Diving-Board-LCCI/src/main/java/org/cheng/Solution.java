package org.cheng;

/**
 * 跳水板
 * 
 * @author lucheng
 *
 */
public class Solution {
	public int[] divingBoard(int shorter, int longer, int k) {
		if (k == 0) {
			return new int[0];
		}

		if (shorter == longer) {
			return new int[] { shorter * k };
		}

		int[] arry = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			arry[i] = shorter * (k - i) + longer * i;
		}
		return arry;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arry = s.divingBoard(2, 2, 0);
		for (int i : arry) {
			System.out.print(i + ",");
		}

	}
}