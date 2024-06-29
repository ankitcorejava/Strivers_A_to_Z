package com.step3_arrays;

import java.util.Arrays;
import java.util.Stack;

/**
 * input = {1,2,3,4,5,6,7,8,9} output = {5,4,3,2,1,6,7,8,9}
 */
public class ArraysRightRotation2 {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		arraysRightRotation2(input, 5);
	}

	public static void arraysRightRotation2(int[] input, int a) {

		Stack<Integer> stk = new Stack<Integer>();

		for (int i = 0; i < a; i++) {
			stk.push(input[i]);
		}
		
		for (int i = 0; i < a; i++) {
			input[i] = stk.pop();
		}

		Arrays.stream(input).boxed().forEach(x -> System.out.print(x + ","));
	}

}
