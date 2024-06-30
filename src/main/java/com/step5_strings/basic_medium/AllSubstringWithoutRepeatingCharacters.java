package com.step5_strings.basic_medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * 
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
 * Example 1: * Input: s = "abcabcbb" Output: 3 Explanation: The answer is
 * "abc", with the length of 3.
 */
public class AllSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		System.out.println(AllSubstring("abcdeabcbb"));
	}

	public static List<String> AllSubstring(String s) {

		// To store Temporary answers:
		StringBuffer strbuf = new StringBuffer();
		// ArrayList
		List<String> list = new ArrayList<>();
		Set<Character> sets = new LinkedHashSet<>();

		for (int i = 0; i < s.length(); i++) {

			if (sets.isEmpty()) {
				sets.add(s.charAt(i));
				strbuf.append(s.charAt(i));
			} else if (!sets.contains(s.charAt(i))) {
				sets.add(s.charAt(i));
				strbuf.append(s.charAt(i));
			} else {
				int idx = 0;
				list.add(strbuf.toString());
				Iterator<Character> itr = sets.iterator();
				while (itr.hasNext()) {
					Character ch = itr.next();
					if (s.charAt(i) == ch) {
						itr.remove();
						idx++;
						break;
					} else {
						itr.remove();
						idx++;
					}
				}
				strbuf = strbuf.delete(0, idx);
				sets.add(s.charAt(i));
				strbuf.append(s.charAt(i));
			}

		}

		return list;

	}

}
