package org.cheng;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 单词拆分
 * 
 * @author lucheng
 *
 */
public class Solution2 {
	public boolean wordBreak(String s, List<String> wordDict) {
		int minLen = s.length();
		int maxLen = 0;
		Set<String> map = new HashSet<>(Math.max((int) (wordDict.size() / .75f) + 1, 16));
		for (String wd : wordDict) {
			map.add(wd);
			minLen = Math.min(minLen, wd.length());
			maxLen = Math.max(maxLen, wd.length());
		}

		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		for (int i = minLen; i <= s.length(); i++) {
			for (int j = i > maxLen ? (i - maxLen) : 0; j < i - minLen + 1; j++) {
				String k = s.substring(j, i);
//				System.out.println("i:" + i + " j: " + j + " " + k);
				if (dp[j] && map.contains(k)) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}

	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		String s = null;
		List<String> wordDict = null;
		s = "leetcode";
		wordDict = Arrays.asList("leet", "code");
		System.out.println(solution.wordBreak(s, wordDict));
		s = "catsandog";
		wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
		System.out.println(solution.wordBreak(s, wordDict));
		s = "aaaaaaa";
		wordDict = Arrays.asList("aaaa", "aaa");
		System.out.println(solution.wordBreak(s, wordDict));
		s = "goalspecial";
		wordDict = Arrays.asList("go", "goal", "goals", "special");
		System.out.println(solution.wordBreak(s, wordDict));
	}
}
