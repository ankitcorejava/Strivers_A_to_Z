package com.step5_strings.basic_medium;

/**
 * 14. Longest Common Prefix Write a function to find the longest common prefix
 * string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"] Output: "fl"
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));

		String[] strs2 = { "dog", "racecar", "car" };
		System.out.println(longestCommonPrefix(strs2));
	}

	public static String longestCommonPrefix(String[] strs) {

		// find the smallest String:
		String smallestString = strs[0];
		for (int i = 1; i < strs.length; i++) {

			if (smallestString.length() > strs[i].length()) {
				smallestString = strs[i];
			}
		}

		int itrCnt = 0;

		while ((itrCnt < strs.length) && (smallestString.length() > 0)) {
			itrCnt = 0;
			for (String str : strs) {
				if (str.startsWith(smallestString)) {
					itrCnt++;
				}
			}

			if (itrCnt == strs.length) {
				return smallestString;
			}
			smallestString = smallestString.substring(0, smallestString.length() - 1);

		}
		return "";
	}

}
