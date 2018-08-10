package com.rups.dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class StackDemoString {

	public static void main(String[] args) {
		System.out.println("Please enter a string - ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		Stack<Character> stack = new Stack<Character>();

		System.out.println("Entered string is - " + str);

		boolean result = checkString(stack, str);
		System.out.println(result);
	}

	public static boolean checkString(Stack<Character> stack, String str) {
		int strLength = str.length();

		char[] charArr = str.toCharArray();

		for (int i = 0; i < strLength; i++) {
			if (charArr[i] == '{' || charArr[i] == '[' || charArr[i] == '(') {
				stack.push(charArr[i]);
			} else if (charArr[i] == '}' || charArr[i] == ']' || charArr[i] == ')') {
				char ch = stack.pop();
				if (ch == '(' && charArr[i] == ')') {
					continue;
				} else if (ch == '[' && charArr[i] == ']') {
					continue;
				} else if (ch == '{' && charArr[i] == '}') {
					continue;
				}
			}
		}

		if (stack.isEmpty()) {
			return true;
		}

		return false;
	}
}
