package com.java.datastructure;

/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;

public class Permutation {
	/*
	 * Method for permutation
	 */
	private void permutation(String str, int L, int R) {
		if (L == R)
			System.out.println(str);
		else {
			for (int i = L; i <= R; i++) {
				str = swap(str, L, i);
				permutation(str, L + 1, R);
				/*
				 * BackTracking
				 */
				str = swap(str, L, i); 
			}
		}

	}
		/*
		 * Method for Swapping
		 */
	public String swap(String str, int i, int j) {
		//Declaring temp variable
		char temp;
		/*
		 * Actual char Array
		 */
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/*
	 * program execution starts from main method
	 */
	public static void main(String[] args) {
		/*
		 * Taking user input to the scanner class
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = input.next();
		int length = str.length();
		//class object
		Permutation permutation = new Permutation();
		permutation.permutation(str, 0, length - 1);
	}

}
