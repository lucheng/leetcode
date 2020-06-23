package org.cheng;

import java.util.HashMap;
import java.util.Map;
/**
 *  无重复字符的最长子串
 * @author lucheng
 *
 */
public class Solution2 {
	public int lengthOfLongestSubstring(String s) {
		int maxLen = 0;
		Map<Character, Integer> map = new HashMap<>(s.length());
		for (int end = 0, start = 0; end < s.length(); end++) {
			char c = s.charAt(end);
			if (map.containsKey(c)) {
				start = Math.max(map.get(c), start);
			}
			maxLen = Math.max(maxLen, end - start + 1);
			map.put(c, end + 1);
		}
		return maxLen;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.lengthOfLongestSubstring("a"));
	}
}
