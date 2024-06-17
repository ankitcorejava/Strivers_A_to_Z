package com.step5_strings.basic_medium;

import java.util.Stack;

/**
 * 1614. Maximum Nesting Depth of the Parentheses
 * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
 * 
 * Given a valid parentheses string s, return the nesting depth of s. The
 * nesting depth is the maximum number of nested parentheses. * Example 1: *
 * Input: s = "(1+(2*3)+((8)/4))+1" * Output: 3 * Explanation: * Digit 8 is
 * inside of 3 nested parentheses in the string.
 */
public class MaxDepthOfParentheses {

	public static void main(String[] args) {

		System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
		System.out.println(maxDepth( "(1)+((2))+(((3)))"));
	}

	public static int maxDepth(String s) {

		int maxCnt = 0;
		Stack<Character> stk = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				stk.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if ((!stk.isEmpty()) && (stk.peek() == '(')) {
					maxCnt = maxCnt < stk.size()?stk.size():maxCnt;
					stk.pop();
				}
			}

		}
		return maxCnt;

	}

}
