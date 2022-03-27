package com.interview.amazon.gfg;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 
 * Problem Statement: Stock buy and sell - GFG
 * 
 * Dynamic Programming | Greedy Approach | Array
 * 
 * Author: Dhruv Soni
 * 
 * Date : 22th March 2022
 * 
 */

public class StockBuyAndSell {

	static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int start = 0, end = 1;
		int maxProfit = 0;

		if (n == 1) {
			return result;
		}
		ArrayList<Integer> data = new ArrayList<>();
		while (end < n && start < end) {

			if (A[end] - A[start] >= maxProfit && A[end] != A[start]) {

				data = new ArrayList<Integer>();
				maxProfit = A[end] - A[start];
				data.add(start);
				data.add(end);

				++end;

			} else if (A[end] - A[start] < maxProfit && A[end] != A[start]) {

				if (!data.isEmpty()) {
					maxProfit = 0;
					result.add(data);
					data = new ArrayList<Integer>();
				}

				start = end;
				end = start + 1;

			} else if (A[start] == A[end]) {

				if (end == n - 1) {
					result.forEach(i -> System.out.println(i));
					System.out.println("returned from here......");
					return result;

				}

				++end;

			}

			if (end == n) {
				if (!data.isEmpty()) {
					result.add(data);
					result.forEach(i -> System.out.println(i));
					return result;
				}
			}

		}

		result.forEach(i -> System.out.println(i));

		return result;
	}

	public static void main(String[] args) {

		int[] pass = new int[] { 1, 1, 1, 2, 1, 3 };
		stockBuySell(pass, pass.length);

	}

}

//while (end < A.length && start < end) {
//
//	if (A[start] < A[end]) {
//
//		if (A[end] - A[start] > maxProfit) {
//
//			data = new ArrayList<Integer>();
//			maxProfit = A[end] - A[start];
//			data.add(start);
//			data.add(end);
//
//		}
//
//		if (end == A.length - 1) {
//			maxProfit = 0;
//			result.add(data);
//		}
//
//		++end;
//
//	} else if (A[start] > A[end]) {
//
//		if (!data.isEmpty()) {
//			maxProfit = 0;
//			result.add(data);
//		}
//
//		start = end;
//		end = start + 1;
//
//	} else if (A[start] == A[end]) {
//
//		if (end == A.length - 1) {
//			return result;
//
//		}
//
//		++end;
//
//	}
//
//}
