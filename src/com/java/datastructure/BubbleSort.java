package com.java.datastructure;
/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;

public class BubbleSort {
	/*
	 * MethodName:printSortedArray 
	 * Logic for printing the sorted array.
	 */
	static void printSortedArray(int array[]) {
		System.out.println();
		System.out.println("Ater sorting");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
	/*
	 * program execution starts from main method
	 */
	public static void main(String[] args) {
		/*
		 * Taking user input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		/*
		 *  size of array
		 */
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.println("Enter elements of array");
		/*
		 *  enter inputs for array
		 */
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Before Sorting elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// Bubble sort
		/*
		 * (arr.length-1) bcoz in bubble sort we compare elements in pairs like 0th and
		 * 1st index value, 1st and 2nd index value
		 */
		for (int i = 0; i < array.length - 1; i++) {
			/*
			 * (arr.length-1-i) here i represents the number of sorted elements in the array
			 * 1st time i=0 no elements sorted 2nd time i=1 1 element is sorted . .
			 * 
			 */
			for (int j = 0; j < array.length - 1 - i; j++) {
				int temp;
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		printSortedArray(array);
	}


}
