package org.cheng;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 * 
 * @author lucheng
 *
 */
public class Solution {
	private static final Map<Character, Integer> MAP = new HashMap<>();
	static {
		MAP.put('I', 1);
		MAP.put('V', 5);
		MAP.put('X', 10);
		MAP.put('L', 50);
		MAP.put('C', 100);
		MAP.put('D', 500);
		MAP.put('M', 1000);
	}

	public int romanToInt(String s) {
		int res = 0;
		int previous = 0;
		char[] cAr = s.toCharArray();
		for (int i = cAr.length - 1; i >= 0; i--) {
			int v = MAP.get(cAr[i]);
			if (v >= previous) {
				res += v;
			} else {
				res -= v;
			}
			previous = v;
		}
		return res;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.romanToInt("IV"));
	}
}
