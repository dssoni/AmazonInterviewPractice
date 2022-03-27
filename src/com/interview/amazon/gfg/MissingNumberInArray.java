package com.interview.amazon.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Problem Statement: Missing number in unordered distinct array - GFG
 * 
 * Kadane's Algorithm for all Integers Author: Dhruv Soni
 * 
 */

public class MissingNumberInArray {

	static int missingNumber(int array[], int n) {

		Arrays.sort(array);

		for (int j = 0; j < n; j++) {

			if (array[j] != j + 1) {
				return (j + 1);
			}

		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] { 1 }, 2));

	}

}
