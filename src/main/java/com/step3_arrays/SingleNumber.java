package com.step3_arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

/**
 * 136. Single Number https://leetcode.com/problems/single-number/description/
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space. Example 1:
 * 
 * Input: nums = [2,2,1] Output: 1
 */
public class SingleNumber {

	public static void main(String[] args) {

		SingleNumber m = new SingleNumber();
		int[] nums = { 4,1,2,1,2};
		System.out.println(m.singleNumber(nums));
	}

	public int singleNumber(int[] nums) {

		Map<Integer, Integer> maps = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			maps.put(nums[i], maps.getOrDefault(nums[i], 0) + 1);
		}

		System.out.println(maps);
		
		Predicate<Entry<Integer, Integer>> pred = x -> x.getValue()<2;
		return (maps.entrySet().stream().filter(pred).findAny().get().getKey());

	}

}
