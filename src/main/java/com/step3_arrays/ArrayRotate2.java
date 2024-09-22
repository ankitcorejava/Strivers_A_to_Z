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
public class ArrayRotate2 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		// split into 2 part:
		// Part-1 = {1,2,3,4,5,6}
		// Part-2 ={7}
		// Reverse Part1 = 654321
		// Reverse Part2= 7;
		// 6543217
		// Reverse all
		// 7123456
		// {7,1,2,3,4,5,6};
		// rotate(nums, 3);
		// Part-1:
		int k = 3;
		nums = reverse(nums, 0, (nums.length -1- k));

		Arrays.stream(nums).boxed().forEach(x -> System.out.print(x + ","));
		System.out.println();
		// Part-2:
		reverse(nums, (nums.length - k), (nums.length - 1));

		Arrays.stream(nums).boxed().forEach(x -> System.out.print(x + ","));
		System.out.println();
		// Reverse All:
		reverse(nums, 0, (nums.length - 1));

		Arrays.stream(nums).boxed().forEach(x -> System.out.print(x + ","));

	}

	public static int[] reverse(int[] nums, int start, int end) {

		while (start < end && end != -1) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		return nums;
	}
}
