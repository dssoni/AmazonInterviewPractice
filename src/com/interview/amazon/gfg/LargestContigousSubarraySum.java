package com.interview.amazon.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Problem Statement: LargestContigousSubarraySum - GFG
 * 
 * Kadane's Algorithm for all Integers Author: Dhruv Soni
 * 
 * Date: 18th March 2022
 * 
 */

public class LargestContigousSubarraySum {

	static long maxSubarraySum(int arr[], int n) {

		long currentSum = arr[0], maxSum = arr[0];

		for (int i = 1; i < n; i++) {

			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);

		}
		System.out.println(maxSum);
		return maxSum;
	}

	public static void main(String args[]) {

//		maxSubarraySum(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }, 9);
		maxSubarraySum(new int[] { -1, -2, -3, -4, -5 }, 5);

	}
}

// BRUTE FORCE APPROACH

//List<Integer> sums = new ArrayList<Integer>();
//int sum = 0;
//
//for (int i = 0; i < n; i++) {
//
//	sum = arr[i];
//	sums.add(arr[i]);
//
//	for (int j = i + 1; j < n; j++) {
//
//		sum += arr[j];
//		sums.add(sum);
//
//	}
//}
//
//System.out.println(Collections.max(sums));

// Efficient Approach
// Kadane's Algorithm
// (For All positives in Array)
//currentSum += arr[i];
//if (currentSum > maxSum) {
//	maxSum = currentSum;
//}
//
//if(currentSum<0) {
//	currentSum = 0;
//}
