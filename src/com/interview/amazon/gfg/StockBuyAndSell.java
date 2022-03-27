package com.interview.amazon.gfg;

import java.util.ArrayList;

/**
 * 
 * Problem Statement: Stock buy and sell - GFG
 * 
 * Dynamic Programming | Greedy Approach | Array
 * 
 * Author: Dhruv Soni
 * 
 * Date : 27th March 2022
 * 
 */

public class StockBuyAndSell {

	static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> data = new ArrayList<Integer>();
		int maxProfit = -1;
		int j = 0;
		for (int i = 0; i + 1 < n; i++) {
			j = i + 1;

			if (A[i] < A[j]) {
				maxProfit = A[j] - A[i];
				while (A[i] < A[j]) {
					++j;
					if (j == n) {
						data.add(i);
						data.add(j - 1);
						result.add(data);
						data = new ArrayList<Integer>();
						maxProfit = -1;
						i = j - 1;
						break;
					}
					if (A[j] - A[i] > maxProfit) {
						maxProfit = A[j] - A[i];
					} else if (A[j] - A[i] <= maxProfit) {
						data.add(i);
						data.add(j - 1);
						result.add(data);
						data = new ArrayList<Integer>();
						maxProfit = -1;
						i = j - 1;
						break;
					}
				}
			} else if (A[i] > A[j] || A[i] == A[j]) {
				if (maxProfit == -1) {
					continue;
				}
			}
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

		int[] pass = new int[] { 4, 2, 2, 2, 3 };
		stockBuySell(pass, pass.length);

	}

}
