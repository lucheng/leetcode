package org.cheng;

/**
 * 加一
 * 
 * @author lucheng
 *
 */
public class Solution {

	public int[] plusOne(int[] digits) {
		for (int i = digits.length; i > 0; i--) {
			digits[i - 1]++;
			digits[i - 1] = digits[i - 1] % 10;
			if (digits[i - 1]!= 0) {
				return digits;
			}
			
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] digits = new int[] { 8, 9, 9 };
		for (int i : s.plusOne(digits)) {
			System.out.print(i);
		}

	}
}
