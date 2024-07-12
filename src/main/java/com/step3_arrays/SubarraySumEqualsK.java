package com.step3_arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 560. Subarray Sum Equals K
 * 
 * https://leetcode.com/problems/subarray-sum-equals-k/description/
 * 
 * Given an array of integers nums and an integer k, return the total number of
 * subarrays whose sum equals to k. A subarray is a contiguous non-empty
 * sequence of elements within an array.
 * 
 * Example 1: Input: nums = [1,1,1], k = 2 Output: 2 Example 2: Input: nums =
 * [1,2,3], k = 3 Output: 2
 */
public class SubarraySumEqualsK {

	public static void main(String[] args) {

		int input[] = { 1, 1, 1 };
		int k = 2;

		//SubarraySumEqualsK.subarraySum(input, k);

		int input1[] = { 1, 2, 3 };
		int k1 = 3;
		SubarraySumEqualsK.subarraySum(input1, k1);
	}

	public static int subarraySum(int[] nums, int k) {

		int sum = 0;
		List<Integer> list = new ArrayList<>();

		List<List<Integer>> finalList = new ArrayList<List<Integer>>();

		for (int i = 0; i < nums.length; i++) {

			if (sum < k) {
				sum = sum + nums[i];
				list.add(nums[i]);

			} else if (sum == k) {
				finalList.add(new ArrayList<>(list));
				int removable = list.isEmpty() ? 0 : list.get(0);
				list.remove(0);
				sum = sum - removable;

				// Add new elements :
				sum = sum + nums[i];
				list.add(nums[i]);
			} else if (sum > k) {

				while (sum > k) {

					int removable = list.isEmpty() ? 0 : list.get(0);
					list.remove(0);
					sum = sum - removable;
				}

				// Add new elements :
				sum = sum + nums[i];
				list.add(nums[i]);
			}
			if ((i == nums.length - 1) && (sum == k)) {
				finalList.add(new ArrayList<>(list));
			}

		}

		System.out.println(finalList);
		return k;

	}

}
