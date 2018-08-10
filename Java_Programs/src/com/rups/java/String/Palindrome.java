package com.rups.java.String;

public class Palindrome {
	
	public static void main(String[] args) {
		String str = "radar";
		
		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	
}
