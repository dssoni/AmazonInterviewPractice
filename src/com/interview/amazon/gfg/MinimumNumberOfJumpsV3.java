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

public class MinimumNumberOfJumpsV3 {

	static int minJumps(int[] arr) {

		int n = arr.length;
		int jumps = 0;

		if (n == 1) {
			return 0;
		}

		int end = 0;
		while (end < n) {

			int number = arr[end];

			if (number == 0) {
				return -1;
			}

			++end;
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