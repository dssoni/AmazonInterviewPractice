package com.interview.amazon.gfg;

/**
 * 
 * Problem Statement: Minimum number of Jumps - GFG
 * 
 * Dynamic Programming
 * 
 * Author: Dhruv Soni
 * 
 * Date : 19th March 2022
 * 
 */

public class MinimumNumberOfJumps {

	static int minJumps(int[] arr) {

		int n = arr.length;
		int jumps = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] == 0) {
				return -1;
			}

			if (arr[i] == 1) {
				++jumps;

				if (i + arr[i] >= n - 1) {
					break;
				}
			} else {

				int end = i + arr[i];
				int maxIndex = 0;
				int max = 0;

				if (end >= n - 1) {
					++jumps;
					break;
				}

				while (i + 1 <= end) {
					if (arr[i + 1] > max) {
						max = arr[i + 1];
						maxIndex = i + 1;
					}
					++i;
				}
				++jumps;
				i = maxIndex - 1;

			}

		}
		System.out.println(jumps);
		return jumps;
	}

	public static void main(String args[]) {
		minJumps(new int[] { 9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1 });
	}

}

//if (arr[i] == 0)
//return -1;
//
//i += arr[i] - 1;
//
//++counter;
//if (i + 1 == n - 1) {
//System.out.println(counter);
//return counter;
//}