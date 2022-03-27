package com.interview.amazon.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Problem Statement: Word with Maximum Frequency - GFG
 * 
 * Hashing technique
 * 
 * Author: Dhruv Soni
 * 
 * Date : 20th March 2022
 * 
 */

public class WordWithMaximumFrequency {

	public static String maximumFrequency(String S) {

		String[] wArray = S.split(" ");
		List<String> words = Arrays.asList(wArray);
		int maxCount = 0;
		String result = null;

		Map<String, Integer> wMap = new HashMap<String, Integer>();

		for (int i = 0; i < words.size(); i++) {
			String str = words.get(i);

			if (!wMap.containsKey(str)) {
				wMap.put(str, 1);
				if (1 > maxCount) {
					maxCount = 1;
					result = str;
				}
			} else {

				wMap.put(str, wMap.get(str) + 1);

				if (wMap.get(str) > maxCount) {
					maxCount = wMap.get(str);
					result = str;
				} else if (wMap.get(str) == maxCount) {
					if (words.indexOf(str) < words.indexOf(result)) {
						maxCount = wMap.get(str);
						result = str;
					}
				}
			}
		}

		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		maximumFrequency("rjs kot w lmy nh fn zo cfg bl m q ms pnt tko iym uo nmx jl vn i sin");
	}

}

// complicated test cases
// a e e ay t hb q a fu uca c m l zb
// aa bb c d d efg h ijk l h
