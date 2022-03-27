package com.interview.amazon.gfg;

/**
 * 
 * Problem Statement: Implement Strstr - GFG
 * 
 * Locate given String in another provided String and return its first
 * occurrence.
 * 
 * Author: Dhruv Soni
 * 
 * Date: 18th March 2022
 * 
 */
public class ImplementStrstr {

	static int strstr(String s, String x) {

		int j = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == x.charAt(j)) {
				++j;
			} else if (j != 0) {
				i = i - j;
				j = 0;
			}

			if (j == x.length()) {
				return i - j + 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {

		strstr("ababaaaaaa", "abaa");
	}

}

//sample Test Case is as -> find "abaa" from "ababaa"
