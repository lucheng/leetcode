package org.cheng;

/**
 * 回文数字
 * 
 * @author lucheng
 *
 */
public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0 || x % 10 == 0 && x != 0)
			return false;
		long res = 0, y = x;
		while (y != 0) {
			res = res * 10 + y % 10;
			y /= 10;
		}
		return res == x;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isPalindrome(0));
	}
}
