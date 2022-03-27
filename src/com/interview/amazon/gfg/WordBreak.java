package com.interview.amazon.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreak {

	public static int wordBreak(String A, List<String> B) {

		Set<String> words = new HashSet<String>();
		String searchFor = new String();
		int sIndex = 0, eIndex = 0;

		B.forEach(word -> words.add(word));

		for (int i = 0; i < A.length(); i++) {
			sIndex = i;
			eIndex = i + 1;

			while (eIndex < A.length() + 1) {

				searchFor = A.substring(sIndex, eIndex);

				if (words.contains(searchFor)) {
					i = eIndex - 1;
					break;
				} else if (eIndex == A.length()) {
					--i;
					break;
				}

				++eIndex;
			}

			if (eIndex == A.length()) {
				System.out.println("1");
				return 1;
			}

		}
		System.out.println("0");
		return 0;
	}

	public static void main(String[] args) {
		String passString = "abcd";
		String[] words = new String[] { "ab", "bcd", "b", "a" };

		List<String> wordsList = Arrays.asList(words);
		wordBreak(passString, wordsList);
	}

}

// TO PASS
//String passString = "ilike";
//String[] words = new String[] { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream",
//		"man", "go", "mango" };
//
//List<String> wordsList = Arrays.asList(words);
//wordBreak(passString, wordsList);

//String[] words = new String[] { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream",
//		"man", "go", "mango" };
