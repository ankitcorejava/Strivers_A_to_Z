package com.step3_arrays;

/**
 * 1752. Check if Array Is Sorted and Rotated
 * https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
 * 
 * iven an array nums, return true if the array was originally sorted in
 * non-decreasing order, then rotated some number of positions (including zero).
 * Otherwise, return false.
 * 
 * There may be duplicates in the original array.
 * 
 * Note: An array A rotated by x positions results in an array B of the same
 * length such that A[i] == B[(i+x) % A.length], where % is the modulo
 * operation.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3,4,5,1,2] Output: true Explanation: [1,2,3,4,5] is the
 * original sorted array. You can rotate the array by x = 3 positions to begin
 * on the the element of value 3: [3,4,5,1,2].
 */
public class ArraySortedAndRotated2 {

	public static void main(String[] args) {

		int[] nums = { 3, 4, 5, 1, 2 };
		System.out.println(check(nums));

		int[] nums1 = { 2, 1, 3, 4 };
		System.out.println(check(nums1));

		int[] nums2 = { 2, 4, 1, 3 };
		System.out.println(check(nums2));

		int[] nums3 = { 1, 2, 3 };
		System.out.println(check(nums3));
	}

	public static boolean check(int[] nums) {

		return false;

	}

}
