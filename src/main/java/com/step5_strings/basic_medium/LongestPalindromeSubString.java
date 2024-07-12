package com.step5_strings.basic_medium;

/**
 * 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 * 
 * Example 1:
 * 
 * Input: s = "babad" Output: "bab" Explanation: "aba" is also a valid answer.
 * Example 2:
 * 
 * Input: s = "cbbd" Output: "bb"
 */
public class LongestPalindromeSubString {

	public static void main(String[] args) {

	}

	public String longestPalindrome(String s) {
		for(int i=0; i<s.length(); i++) {
			
		}

		return s;

	}

	public boolean isPalindrome(String s) {

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
