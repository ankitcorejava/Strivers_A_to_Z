package com.step3_arrays;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 189. Rotate Array https://leetcode.com/problems/rotate-array/description/
 * 
 * Given an integer array nums, rotate the array to the right by k steps, where
 * k is non-negative.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4] Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to the right:
 * [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class ArrayRotate {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		// {7,1,2,3,4,5,6};
		rotate(nums, 14);
	}

	public static void rotate(int[] nums, int k) {

		if (k > nums.length) {
			k = k % nums.length;
		}
		for (int i = 1; i <= k; i++) {
			System.out.println();
			rotate_helper(nums);
		}
	}

	public static int[] rotate_helper(int[] nums) {

		int temp = nums[nums.length - 1];
		for (int i = nums.length - 1; i > 0; i--) {
			nums[i] = nums[i - 1];
		}
		nums[0] = temp;

		Arrays.stream(nums).boxed().forEach(x -> System.out.print(x + ","));

		return nums;

	}

}
