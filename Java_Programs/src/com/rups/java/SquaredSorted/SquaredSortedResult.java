package com.rups.java.SquaredSorted;

import java.util.Scanner;
import java.util.Stack;

/*
 * Description - Input - Sorted input => [ -5 -3 0 1 3 5 6] => Squared => [25 9 0 1 9 25 36] => FInalResult => [0 1 9 9 25 36]
 * 
 * @author - Roopali Ghodke
 */
public class SquaredSortedResult {

	public static void main(String[] args) {
		System.out.println("Enter sorted input -");

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] strInput = str.split("\\s");
		int[] input = new int[strInput.length];

		for (int i = 0; i < strInput.length; i++) {
			input[i] = Integer.parseInt(strInput[i]);
		}

		System.out.println("Sorted input entered is - ");
		for (int in : input) {
			System.out.print(in + " ");
		}
		System.out.println();
		squaredInput(input);
	}

	public static void squaredInput(int[] input) {
		for (int i = 0; i < input.length; i++) {
			input[i] = input[i] * input[i];
		}
		System.out.println("Squared result of the input is - ");
		for (int in : input) {
			System.out.print(in + " ");
		}
		System.out.println();
		sortedInput(input);

	}

	public static void sortedInput(int[] input) {
		int leftIndex = 0;
		int rightIndex = input.length - 1;
		int outputIndex = input.length;
		int[] result = new int[outputIndex];

		while (leftIndex <= rightIndex) {
			if (input[leftIndex] > input[rightIndex]) {
				System.out.println();
				result[outputIndex - 1] = input[leftIndex];
				leftIndex++;
				outputIndex--;
			} else if (input[leftIndex] < input[rightIndex]) {
				result[outputIndex - 1] = input[rightIndex];
				rightIndex--;
				outputIndex--;
			} else {
				result[outputIndex - 1] = input[leftIndex];
				leftIndex++;
				outputIndex--;
			}
		}

		System.out.println("Final sorted result of the input is - ");
		for (int in : result) {
			System.out.print(in + " ");
		}
	}

}
