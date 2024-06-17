package com.step5_strings.basic_medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;


/**
 * 451. Sort Characters By Frequency
 * https://leetcode.com/problems/sort-characters-by-frequency/description/
 * 
 * Given a string s, sort it in decreasing order based on the frequency of the
 * characters. The frequency of a character is the number of times it appears in
 * the string.
 * 
 * Return the sorted string. If there are multiple answers, return any of them.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "tree" Output: "eert" Explanation: 'e' appears twice while 'r' and
 * 't' both appear once. So 'e' must appear before both 'r' and 't'. Therefore
 * "eetr" is also a valid answer.
 */
public class FrequencySortByCharacter {

	public static void main(String[] args) {
		System.out.println(frequencySort("tree"));
		System.out.println(frequencySort("cccaaa"));
	}

	public static String frequencySort(String s) {

		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder strBuilder = new StringBuilder();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (map.isEmpty()) {
				map.put(s.charAt(i), 1);
			} else if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}

		}
		Map<Character, Integer> lmap = new LinkedHashMap<>();
		Comparator<Entry<Character, Integer>> comp = (a, b) -> b.getValue().compareTo(a.getValue());
		Consumer<Entry<Character, Integer>> cons = x -> lmap.put(x.getKey(), x.getValue());
		map.entrySet().stream().sorted(comp).forEach(cons);

		Iterator<Entry<Character, Integer>> itr = lmap.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> entry = itr.next();
			for (int i = 0; i < entry.getValue(); i++) {

				strBuilder.append(entry.getKey());
			}

		}

		return strBuilder.toString();

	}

}
