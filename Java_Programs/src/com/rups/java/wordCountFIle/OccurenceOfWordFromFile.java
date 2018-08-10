package com.rups.java.wordCountFIle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Description - Read a file and count the number of occurrence of a given word
 * @author : Roopali Ghodke
 */
public class OccurenceOfWordFromFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("**************** This program checks the occurence of a given word from a file *******************");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the full path of a file name - ");
		String file = scanner.nextLine();
		System.out.println("The path of the file to read is - " + file);
		
		System.out.println("Enter a word to check the number of times it has occured in a given file - ");
		String wordCount = scanner.nextLine();
		
		FileReader file2 = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(file2);
		String inputLine = null;
		Map<String, Integer> map = new HashMap<>();
		while ((inputLine = bufferedReader.readLine()) != null) {
			String[] words = inputLine.split("\\s");

			int wordLength = words.length;

			for (int i = 0; i < wordLength; i++) {
				if (map.isEmpty()) {
					map.put(words[i], 1);
				} else {
					if (map.containsKey(words[i])) {
						map.put(words[i], map.get(words[i]) + 1);
					} else {
						map.put(words[i], 1);
					}
				}
			}
		}
		
		System.out.println(map);
		
		if(map.containsKey(wordCount)){
			System.out.println("Occurence of a word  " + wordCount + " is - " + map.get(wordCount));
		}
	}

}
