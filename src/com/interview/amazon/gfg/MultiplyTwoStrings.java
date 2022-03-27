package com.interview.amazon.gfg;

import java.math.BigInteger;

/**
 * 
 * Problem Statement: Multiply two Strings - GFG
 * 
 * Numbers are in as Strings and could be Negative.
 * 
 * Author: Dhruv Soni
 * 
 * Date: 18th March 2022
 * 
 */
public class MultiplyTwoStrings {

	static public String multiplyStrings(String s1, String s2) {

		BigInteger n1 = new BigInteger(s1);
		BigInteger n2 = new BigInteger(s2);
		BigInteger res = (n1.multiply(n2));

		return res.toString();
	}

	public static void main(String[] args) {

		System.out.println(multiplyStrings("505041410988047", "3318139"));

	}

}

// Used BigInteger to handle large numbers
// available in java.math.BigInteger