package com.step3_arrays;

/**
 * 485. Max Consecutive Ones
 * 
 * https://leetcode.com/problems/max-consecutive-ones/description/ Given a
 * binary array nums, return the maximum number of consecutive 1's in the array.
 * Example 1:
 * 
 * Input: nums = [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or
 * the last three digits are consecutive 1s. The maximum number of consecutive
 * 1s is 3. Example 2:
 * 
 * Input: nums = [1,0,1,1,0,1] Output: 2
 */
public class FindMaxConsecutiveOnes {

	public static void main(String[] args) {

		FindMaxConsecutiveOnes m = new FindMaxConsecutiveOnes();
		int[] nums = { 1,1,0,1,1,1 };
		System.out.println(m.findMaxConsecutiveOnes(nums));
	}

	public int findMaxConsecutiveOnes(int[] nums) {

		int subMax = 0;
		int finalMax = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 1) {
				subMax++;
			} else {
				
				finalMax = finalMax > subMax ? finalMax : subMax;
				subMax=0;
			}
		}

		return finalMax = finalMax > subMax ? finalMax : subMax;

	}

}
