package org.cheng;

import java.util.HashSet;
import java.util.Set;
/**
 * 无重复字符的最长子串
 * @author lucheng
 *
 */
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int maxLen = 0;
		Set<Character> set1 = new HashSet<>(s.length());
		for (int i = 0; i < s.length(); i++) {
			set1.add(s.charAt(i));
			for (int j = i + 1; j < s.length(); j++) {
				if (set1.contains(s.charAt(j))) {
					maxLen = Math.max(set1.size(), maxLen);
					set1.clear();
					break;
				}
				set1.add(s.charAt(j));
			}

		}
		return Math.max(set1.size(), maxLen);
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
	}
}
