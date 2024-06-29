package com.step3_arrays;

import java.util.Arrays;

/**
 * input = {1,2,3,4,5,6,7,8,9} output = {5,4,3,2,1,6,7,8,9}
 */
public class ArraysRightRotation {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		arraysRightRotation(input, 5);
	}

	public static void arraysRightRotation(int[] input, int a) {

		for (int i = 0; i < a/2; i++) {
			int temp = input[i];
			input[i] = input[a-1- i];
			input[a - 1- i] = temp;
		}

		Arrays.stream(input).boxed().forEach(x -> System.out.print(x +","));
	}

}
