package com.interview.amazon.gfg;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 
 * Problem Statement: Parenthesis Checker - GFG
 * 
 * Stack Implementation
 * 
 * Author: Dhruv Soni
 * 
 * Date: 18th March 2022
 * 
 */
public class ParanthesisChecker {

	static boolean ispar(String x) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < x.length(); i++) {

			char currentPar = x.charAt(i);
			if (currentPar == '{' || currentPar == '[' || currentPar == '(') {
				stack.push(currentPar);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}

			if (currentPar == ')') {
				if (stack.pop() != '(') {
					return false;
				}
			} else if (currentPar == '}') {
				if (stack.pop() != '{') {
					return false;
				}
			} else if (currentPar == ']') {
				if (stack.pop() != '[') {
					return false;
				}
			}

		}

		return stack.isEmpty();

	}

	public static void main(String[] args) {

		System.out.println(ispar("])}"));

	}

}
