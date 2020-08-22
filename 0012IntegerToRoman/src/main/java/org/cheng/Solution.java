package org.cheng;

import java.util.HashMap;
import java.util.Map;

/**
 * 整数转罗马数字
 * 
 * @author lucheng
 *
 */
public class Solution {

	public String intToRoman(int num) {
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};  // 罗马数字
		int[] arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};  // 阿拉伯数字

		StringBuilder ans = new StringBuilder();
		int index = 0;
		while (num > 0) {
			int count = num / arab[index];
			while (count-- > 0) {
				ans.append(roman[index]);
			}
			num %= arab[index];
			index++;
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.intToRoman(3893));
	}
}
