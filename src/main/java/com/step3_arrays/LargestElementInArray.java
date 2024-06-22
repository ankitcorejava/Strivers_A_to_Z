package com.step3_arrays;

/**
 * Largest Element in Array
 * https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array
 * Given an array A[] of size n. The task is to find the largest element in it.
 * * Example 1:
 * 
 * Input: n = 5 A[] = {1, 8, 7, 56, 90} Output: 90 Explanation: The largest
 * element of given array is 90.
 */
public class LargestElementInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 8, 7, 56, 90 };

		System.out.println(largest(arr, arr.length));
	}

	public static int largest(int arr[], int n) {
		int largest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			largest = largest < arr[i] ? arr[i] : largest;
		}

		return largest;

	}

}
