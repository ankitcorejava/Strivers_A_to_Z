package com.step5_strings.basic_medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram Given two strings s and t, return true if t is an anagram
 * of s, and false otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * Example 1: Input: s = "anagram", t = "nagaram" Output: true
 * 
 * Example 2: Input: s = "rat", t = "car" Output: false
 */
public class isValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("yqhbicoumu", "ouiuycbmqh"));
	}

	public static boolean isAnagram(String s, String t) {

		Map<Character, Integer> map_s = new HashMap<>();

		if (s.length() != t.length()) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			map_s.put(s.charAt(i), map_s.getOrDefault(s.charAt(i), 0) + 1);
			map_s.put(t.charAt(i), map_s.getOrDefault(t.charAt(i), 0) - 1);

		}
		
		for (int iCnt : map_s.values()) {
			if (iCnt != 0) {
				return false;
			}
		}

		return true;
	}

}
