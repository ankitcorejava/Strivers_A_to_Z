package com.step5_strings.basic_medium;

/**
 * https://leetcode.com/problems/compare-version-numbers/description/ 165.
 * Compare Version Numbers
 * 
 * Given two version strings, version1 and version2, compare them. A version
 * string consists of revisions separated by dots '.'. The value of the revision
 * is its integer conversion ignoring leading zeros.
 * 
 * To compare version strings, compare their revision values in left-to-right
 * order. If one of the version strings has fewer revisions, treat the missing
 * revision values as 0. Example 1:
 * 
 * Input: version1 = "1.2", version2 = "1.10"
 * 
 * Output: -1
 * 
 * Explanation:
 * 
 * version1's second revision is "2" and version2's second revision is "10": 2 <
 * 10, so version1 < version2.
 */
public class CompareVersionNumbers {

	public static void main(String[] args) {
		String version1 = "1.0.1", version2 = "1";

		System.out.println(compareVersion(version1, version2));
	}

	public static int compareVersion(String version1, String version2) {

		String[] version1Array = version1.split("\\.");
		String[] version2Array = version2.split("\\.");

		int i1 = 0;
		int i2 = 0;
		while (i1 < version1Array.length || i2 < version2Array.length) {

			int v1 = i1 >= version1Array.length ? 0 : Integer.parseInt(version1Array[i1]);
			int v2 = i2 >= version2Array.length ? 0 : Integer.parseInt(version2Array[i2]);

			if (v1 == v2) {
				i1++;
				i2++;
			} else if (v1 < v2) {

				return -1;
			} else if (v1 > v2) {

				return 1;
			}

		}

		return 0;

	}
}
