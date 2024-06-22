package com.step5_strings.basic_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-number-of-substrings
 * Count number of substrings Difficulty: MediumAccuracy: 20.46%Submissions:
 * 95K+Points: 4 Given a string of lowercase alphabets, count all possible
 * substrings (not necessarily distinct) that have exactly k distinct
 * characters.
 * 
 * Example 1:
 * 
 * Input: S = "aba", K = 2 Output: 3 Explanation: The substrings are: "ab", "ba"
 * and "aba".
 */
public class SubStringCount {

	public static void main(String[] args) {
		substrCount("aba", 2);
		substrCount("abaaca", 1);
	}

	static long substrCount(String S, int K) {

		List<String> list = new ArrayList<>();

		for (int i = 0; i < S.length(); i++) {

			for (int j = i + 1; j <= S.length(); j++) {
				String str = S.substring(i, j);
				
			    StringBuffer strBuff = new StringBuffer(str);
			   

				if (Arrays.stream(str.split("	")).distinct().toList().size() == K) {

					if (str.length() >= K) {
						list.add(str);
					}
				}
			}
		}
		System.out.println(list);
		return list.size();

	}

}
