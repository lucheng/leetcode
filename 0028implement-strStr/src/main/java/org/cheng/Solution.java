package org.cheng;

/**
 * 实现 strStr()
 * 
 * @author lucheng
 */
public class Solution {
	public int strStr(String haystack, String needle) {
		if (needle == null || needle.isEmpty()) {
			return 0;
		}

		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			boolean b = false;
			for (int j = 0; j < needle.length(); j++) {
				if (needle.charAt(j) != haystack.charAt(i + j)) {
					b = false;
					break;
				} else {
					b = true;
				}
			}
			if (b) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.strStr("mississippi","issip"));

	}
}
