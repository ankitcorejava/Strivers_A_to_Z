package com.step3_arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Largest Sum Contiguous Subarray (Kadane’s Algorithm) Last Updated : 22 May,
 * 2024 Given an array arr[] of size N. The task is to find the sum of the
 * contiguous subarray within a arr[] with the largest sum.
 * 
 * Example:
 * 
 * Input: arr = {-2,-3,4,-1,-2,1,5,-3} Output: 7 Explanation: The subarray
 * {4,-1, -2, 1, 5} has the largest sum 7.
 * 
 * Input: arr = {2} Output: 2 Explanation: The subarray {2} has the largest sum
 * 1.
 * 
 * Input: arr = {5,4,1,7,8} Output: 25 Explanation: The subarray {5,4,1,7,8} has
 * the largest sum 25.
 */
public class LargestSumContiguousSubarray {

	public static void main(String[] args) {

		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		largestSumContiguousSubarray2(arr);

		int[] arr2 = { 5, 4, 1, 7, 8 };

		largestSumContiguousSubarray2(arr2);

		int[] arr3 = { 2 };

		largestSumContiguousSubarray2(arr3);

	}

	public static void largestSumContiguousSubarray2(int[] arr) {

		int currentSum = 0;
		Deque<Integer> deque = new ArrayDeque<>();
		Deque<Integer> predeque = new ArrayDeque<>();

		for (int i = 0; i < arr.length; i++) {

			currentSum = currentSum + arr[i];
			deque.add(arr[i]);
		}
		int previousSum = currentSum - 1;

		while (currentSum > previousSum) {
			
			if (deque.getFirst() >= deque.getLast()) { 
				previousSum = currentSum;
				predeque = (new ArrayDeque<>(deque));
				currentSum = currentSum - deque.getLast();
				deque.removeLast();
			} else {
				previousSum = currentSum;
				predeque = (new ArrayDeque<>(deque));
				currentSum = currentSum - deque.getFirst();
				deque.removeFirst();
			}
			
			System.out.println("currentSum > previousSum :" +currentSum+ ">"+ previousSum);
		}
		BinaryOperator<Integer> bin = (a, b) -> (a + b);
		int sum = predeque.stream().collect(Collectors.reducing(0, bin));

		System.out.println(predeque + " Sum = " + sum);

	}

}
