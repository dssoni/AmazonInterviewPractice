package com.interview.amazon.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Problem Statement: Trapping the raining water - GFG
 * 
 * Array | Dynamic Programming
 * 
 * Author: Dhruv Soni
 * 
 * Date : 20th March 2022
 * 
 */

public class TrappingTheRainWater {

	static long trappingWater(int arr[], int n) {

		long sWall = 0;
		long water = 0;
		long counter = 0;
		long maxValue = -1;
		int maxIndex = -1;
		long maxCounter = 0;
		long currentSum = 0;
		long maxSum = 0;
		int j = -1;

		for (int tmpI = 1; tmpI < n; tmpI++) {
			if (arr[tmpI - 1] > arr[tmpI]) {
				j = tmpI - 1;
				break;
			}
		}

		if (j == -1) {
			return 0;
		}

		for (int i = j + 1; i < n; i++) {
			sWall = arr[i - 1];

			while (i < n) {

				if (arr[i] >= sWall) {
					maxValue = arr[i];
					maxSum = currentSum;
					maxIndex = i;
					maxCounter = counter;
					break;
				}
				++counter;
				currentSum += arr[i];
				if (arr[i] > maxValue) {
					maxValue = arr[i];
					maxSum = currentSum - arr[i];
					maxIndex = i;
					maxCounter = counter - 1;
				}

				++i;
			}

			if (maxValue >= sWall) {

				water = water + (sWall * maxCounter) - maxSum;

			} else {

				water = water + (maxValue * maxCounter) - maxSum;

			}

			if (i == n - 1) {
				System.out.println(water);
				return water;
			}

			i = maxIndex;
			currentSum = 0;
			maxIndex = -1;
			maxValue = -1;
			maxCounter = 0;
			counter = 0;

		}
		System.out.println(water);
		return water;

	}

	public static void main(String[] args) {

		int[] pass = new int[] { 8, 8, 2, 4, 5, 5, 1 };
		trappingWater(pass, pass.length);

	}

}
