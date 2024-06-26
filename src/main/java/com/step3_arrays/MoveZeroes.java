package com.step3_arrays;

import java.util.Arrays;

/**
 * 283. Move Zeroes https://leetcode.com/problems/move-zeroes/description/ Given
 * an integer array nums, move all 0's to the end of it while maintaining the
 * relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * Example 1:
 * 
 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0] Example 2:
 * 
 * Input: nums = [0]
 */
public class MoveZeroes {

	public static void main(String[] args) {
		int[] input = { 0, 1, 0, 3, 12 };
		MoveZeroes moveZeroes = new MoveZeroes();
		moveZeroes.moveZeroesWithoutACopy(input);
	}

	public void moveZeroesWithoutACopy(int[] nums) {

		int pointer1 = 0;
		int pointer2 = 0;

		while (pointer2 < nums.length) {

			if (nums[pointer1] != 0 && nums[pointer2] != 0) {
				pointer1++;
				pointer2++;
			} else if (nums[pointer1] == 0) {
				while (pointer2 < nums.length && nums[pointer2] == 0) {
					pointer2++;
				}

				if (pointer2 < nums.length) {
					nums[pointer1] = nums[pointer2];
					nums[pointer2] = 0;
					pointer1++;
					pointer2++;
				}
			}

		}

		Arrays.stream(nums).boxed().forEach(x -> System.out.print(x + ","));
	}

}
