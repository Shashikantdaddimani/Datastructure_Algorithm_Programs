package com.java.datastructure;

/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;

public class Permutation {
	/*
	 * str string to calculate permutation for si->Starting index; li->Lower index;
	 */
	private void permute(String str, int si, int li) {
		if (si == li)
			System.out.println(str);
		else {
			for (int i = si; i <= li; i++) {
				str = swap(str, si, i);
				permute(str, si + 1, li);
				str = swap(str, si, i);
			}
		}
	}
		//swapping
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/*
	 * program execution starts from main method
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Word");
		String str = input.next();
		int length = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str, 0, length - 1);
	}

}
