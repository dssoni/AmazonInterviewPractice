package com.interview.amazon.gfg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Problem Statement: Length of The Longest Substring without Repeating
 * Characters - GFG
 * 
 * find length of longest substring from a given String without any repeated
 * characters.
 * 
 * Author: Dhruv Soni
 * 
 * Date: 18th March 2022
 * 
 */
public class LengthOfTheLongestSubstring {

	static int longestUniqueSubsttr(String S) {

		int maxSoFar = 0, currentMax = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int start = 0, end = 0;

		while (end < S.length()) {

			char charAtI = S.charAt(end);

			if (!map.containsKey(charAtI)) {
				++currentMax;
				map.put(charAtI, end);
				++end;
			} else {
				if (map.get(charAtI) + 1 > start) {
					start = map.get(charAtI) + 1;
				}

				map.put(charAtI, end);
				currentMax = end - start + 1;
				++end;
			}

			if (currentMax > maxSoFar) {
				maxSoFar = currentMax;
			}

		}

		System.out.println(maxSoFar);
		return maxSoFar;

	}

	public static void main(String[] args) {

		longestUniqueSubsttr("abdefgabef");

	}

}
