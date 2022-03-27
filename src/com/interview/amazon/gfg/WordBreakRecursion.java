package com.interview.amazon.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreakRecursion {

	public static int wordBreak(String A, List<String> B) {

		Set<String> words = new HashSet<String>();

		B.forEach(word -> words.add(word));

		return wb(A, words) ? 1 : 0;
	}

	static boolean wb(String s, Set<String> words) {
		System.out.println("\n\n\nchecking String   " + s);
		if (s.equals(""))
			return true;

		for (int i = 1; i <= s.length(); i++) {
			System.out.println(s.substring(0, i) + "   " + s.substring(i, s.length()));
			if (words.contains(s.substring(0, i)) && wb(s.substring(i, s.length()), words)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		String passString = "gomanisunglikesamsungiice";
		String[] words = new String[] { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream",
				"man", "go", "mango" };
		List<String> wordsList = Arrays.asList(words);
		System.out.println(wordBreak(passString, wordsList));
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
