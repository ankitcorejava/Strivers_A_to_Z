package com.step5_strings.basic_medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class ReturnKeysBasedonFrequencyRank {

	public static void main(String[] args) {

		int[] input = { 1, 2, 2, 2, 3, 4, 4};

		returnKeysBasedonFrequencyRank(input, 3);

	}

	public static List<Integer> returnKeysBasedonFrequencyRank(int[] input, int k) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0) + 1);
		}

		NavigableMap<Integer, List<Integer>> map2 = new TreeMap<>();
		Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<Integer, Integer> entry = itr.next();
			if (map2.containsKey(entry.getValue())) {
				List<Integer> list = new ArrayList<>();
				list.addAll(map2.get(entry.getValue()));
				list.add(entry.getKey());
				map2.put(entry.getValue(), list);
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(entry.getKey());
				map2.put(entry.getValue(), list);
			}

		}

		map2 = map2.descendingMap();

		System.out.println(map);
		System.out.println(map2);
		int rank = 0;
		Iterator<Entry<Integer, List<Integer>>> itr1 = map2.entrySet().iterator();
		while (itr1.hasNext()) {
			Entry<Integer, List<Integer>> entry = itr1.next();
			rank++;
			if (rank == k) {
				System.out.println(entry.getValue());
			}
		}

		return null;

	}

}
