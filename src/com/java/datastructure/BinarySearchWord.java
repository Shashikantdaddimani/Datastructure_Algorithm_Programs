package com.java.datastructure;
/**
 * imports all the class of the java.utill package
 */
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 *  storing words in string type of array
		 */
		String[] words = { "Amar", "Ravi", "Amruta", "Kiran", "Ramesh", "Geeta", "Harsh" };
		/*
		 *  sorting the array
		 */
		Arrays.sort(words);
		/*
		 *  printing using inbuilt toString in String class
		 */
		System.out.println(Arrays.toString(words));
		for (int i = 0; i < words.length; i++) {
			// System.out.print(i + "-->" + words[i] + " ");
		}
		System.out.println();
		System.out.println("Enter A word to search:");
		String searchWord = input.next();
		if (Arrays.binarySearch(words, searchWord) >= 0) {
			System.out.println(searchWord + " is Found in the array list");
		} else {
			System.out.println(searchWord + " is not Found in the array list");
		}

	}
}
