package com.interview.amazon.gfg;

/**
 * 
 * Problem Statement: Find Maximum loot a thief can do (Optimal loot amount) -
 * GFG
 * 
 * Dynamic Programming | Array | Best Approach
 * 
 * Author: Dhruv Soni
 * 
 * Date : 21th March 2022
 * 
 */
public class SticklerThief {

	static public int findMaxSum(int arr[], int n) {

		if (n == 1) {
			return arr[0];
		}

		if (n == 2) {
			return Math.max(arr[0], arr[1]);
		}

		int dp[] = new int[n];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);

		for (int i = 2; i < n; i++) {

			dp[i] = Math.max(dp[i - 1], arr[i] + dp[i - 2]);

		}

		return dp[n - 1];
	}

	public static void main(String[] args) {

		int[] pass = new int[] { 10 };
		System.out.println(findMaxSum(pass, pass.length));

	}

}

// AMAZING PROBLEM - Dynamic Approach
// Not necessarily need to loot all consecutive houses
// Test case could be: 4 8 3 2 10 :-> Ans: 18
// Reference Used: https://www.youtube.com/watch?v=xlvhyfcoQa4
