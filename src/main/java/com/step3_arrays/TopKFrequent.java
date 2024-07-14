package com.step3_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 347. Top K Frequent Elements
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 * 
 * Given an integer array nums and an integer k, return the k most frequent
 * elements. You may return the answer in any order.
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,1,2,2,3], k = 2 Output: [1,2] Example 2:
 * 
 * Input: nums = [1], k = 1 Output: [1]
 */
public class TopKFrequent {

	public static void main(String[] args) {

		int[] nums = {1,1};
		topKFrequent(nums, 1);
	}

	public static int[] topKFrequent(int[] nums, int k) {
		
		if(nums.length ==1) {
			return nums;
		}

		// Frequency Map:
		Map<Integer, Integer> map = new HashMap<>();

		List<List<Integer>> frequencyList = new ArrayList<List<Integer>>(nums.length);

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			frequencyList.add(new ArrayList<>(0));
		}
		frequencyList.add(new ArrayList<>(0));

		Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<Integer, Integer> entry = itr.next();
			List<Integer> list = new ArrayList<>();
			list.add(entry.getKey());
			if ((!frequencyList.isEmpty()) && (frequencyList.get(entry.getValue())!= null)) {
				list.addAll(frequencyList.get(entry.getValue()));
			}
			frequencyList.set(entry.getValue(), new ArrayList<>(list));
			// frequencyList.set(k, list)
		}

		// System.out.println(frequencyList);

		int[] ans = new int[k];
		int cnt = 0;
		for (int h = (frequencyList.size() - 1); h >= 0; h--) {

			if (!frequencyList.get(h).isEmpty()) {

				for (int a : frequencyList.get(h)) {
					if (cnt < k) {
						ans[cnt] = a;
						cnt++;
					} else {
						break;
					}
				}

			}

		}

		// System.out.println(ans);
		return ans;

	}

}
