package com.interview.amazon.gfg;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Problem Statement: Count The Characters - GFG
 * 
 * Hashing technique
 * 
 * Author: Dhruv Soni
 * 
 * Date : 19th March 2022
 * 
 */

public class CountTheCharacters {

	static Map<Character, Integer> uMap = new HashMap<Character, Integer>();

	static int getCount(String S, int N) {
		for (int i = 0; i < S.length(); i++) {

			char c = S.charAt(i);

			if (!uMap.containsKey(c)) {
				uMap.put(c, 1);
				continue;
			}

			if (uMap.containsKey(c) && S.charAt(i - 1) != c) {
				uMap.put(c, uMap.get(c) + 1);
				continue;
			}

			while (i < S.length() && uMap.containsKey(c) && S.charAt(i - 1) == c) {

				++i;

				if (i < S.length() && S.charAt(i) != c) {
					--i;
					break;
				}
			}

		}
		int counter = 0;
		for (Character c : uMap.keySet()) {
			if (uMap.get(c) == N) {
				++counter;
			}
		}
		System.out.println(counter);
		return counter;
	}

	public static void main(String[] args) {
		getCount("qpevikeff", 2);
	}

}
