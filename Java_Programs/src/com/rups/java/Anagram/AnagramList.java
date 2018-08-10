package com.rups.java.Anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramList {

	public static void main(String[] args) {

		String[] str = { "tea", "cat", "eat", "toe", "tac" };
		int arrLen = str.length;
		isAnagram(str, arrLen);
	}

	public static void isAnagram(String[] str, int arrLen) {
		for (int i = 0; i < arrLen; i++) {
			List<String> list = new ArrayList<>();
			list.add(str[i]);
			for (int j = i + 1; j < arrLen; j++) {
				if (checkAnagramOfTwoString(str[i], str[j])) {
					System.out.println(str[i] + " and " + str[j] + " Are Anagram");
					list.add(str[j]);
				} else {
					System.out.println(str[i] + " and " + str[j] + " Are Not Anagram");
				}
			}
			
			System.out.println(list);
		}
	}

	public static boolean checkAnagramOfTwoString(String str1, String str2) {

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : ch1) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (char c : ch2) {
			if (!map.containsKey(c)) {
				return false;
			} else {
				map.put(c, map.get(c) - 1);
				if (map.get(c) == 0) {
					map.remove(c);
				}
			}
		}

		if (map.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
