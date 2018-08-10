package com.rups.java.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Description - Enter two strings
 * 				Ex - FirstString = abc
 * 					 SecondString = abcde
 * 				Print the extra characters in a string
 * @author : Roopali Ghodke
 */
public class CheckExtraCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First String - ");
		String firstWord = scanner.nextLine();

		System.out.println("Enter Second String - ");
		String secondWord = scanner.nextLine();

		checkExtraCharacter(firstWord, secondWord);
	}

	public static void checkExtraCharacter(String firstWord, String secondWord) {
		Map<Character, Integer> map = new HashMap<>();

		char[] charFirstString = firstWord.toCharArray();
		char[] charSecondString = secondWord.toCharArray();

		for (char c : charSecondString) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (char c : charFirstString) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
				if (map.get(c) == 0) {
					map.remove(c);
				}
			} else {
				map.put(c, 1);
			}
		}

		if (map.isEmpty()) {
			System.out.println("No extra characted present in the second string");
		} else {
			System.out.println(map.toString());
		}

	}

}
