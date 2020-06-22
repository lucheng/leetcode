package org.cheng;

import java.util.Stack;

/**
 * 有效的括号
 * 
 * @author lucheng
 *
 */
public class Solution {

	public boolean isValid(String s) {
		if (s == null || s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.empty() || c != stack.pop())
				return false;
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isValid("()"));
	}
}
