package com.step5_strings.basic_medium;

/**
 * 796. Rotate String Given two strings s and goal, return true if and only if s
 * can become goal after some number of shifts on s.
 * 
 * A shift on s consists of moving the leftmost character of s to the rightmost
 * position.
 * 
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * 
 * Example 1: Input: s = "abcde", goal = "cdeab" Output: true
 */
public class RotateString {

	public static void main(String[] args) {

		System.out.println(rotateString("abcde", "cdeab"));

		System.out.println(rotateString("abcde", "abced"));

		System.out.println(rotateString("bbbacddceeb", "ceebbbbacdd"));
	}

	public static boolean rotateString(String s, String goal) {

		char[] rotatedCharInput = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {

			char[] rotatedChar = rotateString_helper(rotatedCharInput);

			if (rotatedChar[0] == goal.charAt(0)) {
				String fstr = new String(rotatedChar);
				if (fstr.equalsIgnoreCase(goal)) {
					return true;
				} else {
					//return false;
					continue;
				}
			}
			rotatedCharInput = rotatedChar;
		}
		return false;

	}

	public static char[] rotateString_helper(char[] charArry) {

		char temp = charArry[0];
		for (int i = 1; i < charArry.length; i++) {
			charArry[i - 1] = charArry[i];
		}
		charArry[charArry.length - 1] = temp;
		return charArry;
	}

}
