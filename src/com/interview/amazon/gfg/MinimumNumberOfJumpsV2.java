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

public class MinimumNumberOfJumpsV2 {

	static int minJumps(int[] arr) {

		int n = arr.length;
		int jumps = 0;

		if (n == 1) {
			return 0;
		}

		int end = 0;

		while (end < n) {

			int number = arr[end];

			if (end + number >= n - 1) {
				++jumps;
				break;
			}

			if (number == 1) {
				++jumps;
				if (end + 1 >= n - 1) {
					break;
				}
				++end;
				continue;
			}
			int inStart = end + 1;
			int max = 0, maxIndex = 0;
			while (inStart <= end + number) {
				if (arr[inStart] > max) {
					max = arr[inStart];
					maxIndex = inStart;
				}
				if (inStart + arr[inStart] >= n - 1) {
					max = arr[inStart];
					maxIndex = inStart;
					break;
				}
				++inStart;
			}
			++jumps;
			end = maxIndex;

			if (end >= n - 1) {
				break;
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