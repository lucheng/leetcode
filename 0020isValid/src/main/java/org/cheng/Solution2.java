package org.cheng;

/**
 * 有效的括号
 * 
 * @author lucheng
 *
 */
public class Solution2 {

	public boolean isValid(String s) {
		if (s == null || s.length() % 2 != 0) {
			return false;
		}
		int top = -1;
		char[] charArr = new char[s.length()/2+1];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(')
				charArr[++top] = ')';
			else if (c == '{')
				charArr[++top] = '}';
			else if (c == '[')
				charArr[++top] = ']';
			else if (top == -1 || c != charArr[top--])
				return false;

			if (top == s.length() / 2) {
				return false;
			}
		}
		return top == -1;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.isValid("(("));
	}
}
