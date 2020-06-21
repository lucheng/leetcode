package org.cheng;

/**
 * 最长公共前缀
 * 
 * @author lucheng
 *
 */
public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		int subscript = -1;
		int l = strs[0].length();
		for (int i = 0; i < l; i++) {
			for (int j = 1; j < strs.length; j++) {
				if (i == 0) {
					l = Math.min(l, strs[j].length());
				}
				if (i == l || strs[j].charAt(i) != strs[0].charAt(i)) {
					return subscript == -1 ? "" : strs[0].substring(0, subscript + 1);
				}
			}
			subscript = i;
		}
		return subscript == -1 ? "" : strs[0].substring(0, subscript + 1);
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.longestCommonPrefix(new String[] {"abab","aba",""}));
	}
}
