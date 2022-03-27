package com.interview.amazon.gfg;

import java.util.ArrayList;

/**
 * 
 * Problem Statement: SubArray With Given sum - GFG
 * 
 * Two-Pointer Technique
 * 
 * Author: Dhruv Soni
 * 
 * Date : 17th March 2022
 * 
 */
public class SubarrayWithGivenSum {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

		ArrayList<Integer> index = new ArrayList<Integer>();

		int sum = 0, left = 0, right = 0;

		while (right < n) {

			sum += arr[right];

			while (sum > s) {
				sum -= arr[left];
				++left;
			}

			if (sum == s) {
				index.add(left + 1);
				index.add(right + 1);
				return index;
			}

			++right;

		}
		index.add(-1);

		return index;
	}

	public static void main(String args[]) {

		subarraySum(new int[] { 1, 2, 3, 7, 5 }, 5, 12).forEach(i -> System.out.println(i));

	}

}

// BRUTE FORCE APPROACH:--->
//
//int sum = 0;
//for (int i = 0; i < arr.length - 1; i++) {
//
//	sum = arr[i];
//
//	for (int j = i + 1; j < arr.length; j++) {
//		sum += arr[j];
//		if (sum == s) {
//			System.out.println(i + " and " + j);
//		}
//	}
//}

// EFFICIENT APPROACH O(N) ---->
// Reference : https://www.youtube.com/watch?v=Ofl4KgFhLsM

//Using Two-Pointer technique
//		int sum = 0, left = 0, right = 0;
//
//		while (right < n) {
//
//			sum += arr[right];
//
//			while (sum > s) {
//				sum -= arr[left];
//				++left;
//			}
//
//			if (sum == s) {
//				index.add(left + 1);
//				index.add(right + 1);
//				return index;
//			}
//
//			++right;
//
//		}
