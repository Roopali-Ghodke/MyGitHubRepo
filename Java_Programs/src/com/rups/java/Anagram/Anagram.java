package com.rups.java.Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENter two Strings to check whether they are anagram");
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		
		System.out.println("First string entered is - " + str1);
		
		String str2 = scanner.nextLine();
		System.out.println("Second string entered is - " + str2);
		
		isAnagram(str1,str2);
	}

	public static void isAnagram(String str1, String str2) {
		if(str1 != null && str2 != null){
			char[] tempCharStr1 = str1.toCharArray();
			char[] tempCharStr2 = str2.toCharArray();
			
			Arrays.sort(tempCharStr1);
			Arrays.sort(tempCharStr2);
			
			if(Arrays.equals(tempCharStr1, tempCharStr2)){
				System.out.println("Both the string are anagram - " + str1 + " & " + str2);
			}
			else{
				System.out.println("Both the string are not anagram - " + str1 + " & " + str2);
			}
			
		}
	}

}
