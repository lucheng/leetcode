package org.cheng;

/**
 * 无重复字符的最长子串
 * 
 * @author lucheng
 *
 */
public class Solution2 {
	public int kthFactor(int n, int k) {
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				j++;
				if (k == j) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.kthFactor(1, 1));
	}
}
