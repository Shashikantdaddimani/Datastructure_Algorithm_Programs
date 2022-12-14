package com.java.datastructure;
/**
 * imports all the  class of the java.utill package
 */
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	public static void checkAnagram(String word1, String word2) {
		/*
		 * here replace all method is used to remove spaces
		 *
		 */
		word1 = word1.replaceAll(" ", "");
		word2 = word2.replaceAll(" ", "");
		boolean result = true;
		
		
		/*
		 * checking whether the two strings entered are of same length or not 
		 */
		if (word1.length() != word2.length()) {
			result = false;
		} else {
		/*
		 * 	converting our strings into character array and each character will be stored at
		 *  different index and will be easy to compare after sorting.
		 */
			
			char[] StringArray1 = word1.toLowerCase().toCharArray();
			char[] StringArray2 = word2.toLowerCase().toCharArray();
			
			/*
			 * here both the character arrays are sorted using Arrays inbuilt sort method
			 */
			Arrays.sort(StringArray1);
			Arrays.sort(StringArray2);
			
			/*
			 * checking whether both the sorted arrays are same or not
			 */
			result = Arrays.equals(StringArray1, StringArray2);

		}
		/*
		 * if both length and the sorted list is same then they are anagrams
		 */
		if (result == true) {
			System.out.println(word1 + " and " + word2 + "  are anagrams ");
		} else {

			System.out.println(word1 + " and " + word2 + " are not anagrams ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter first String");
		String word1 = input.next();
		 System.out.println("Enter second String");
		String word2 = input.next();
		checkAnagram(word1, word2);

	}
}
