package com.java.datastructure;
/**
 * imports the scanner class of the java.utill package
 */
import java.util.Scanner;

public class InsertionSort {
	/*
	 * MethodName:printSortedArray Logic for printing the sorted array.
	 */
	static void printSortedArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
	/*
	 * program execution starts from main method
	 */
	public static void main(String[] args) {
		/*
		 * Taking user input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Size");
		/*
		 * size of array
		 */
		int size = input.nextInt();

		// int array[]= {71,8,1,13,4};
		int array[] = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		/*
		 * consider that 0th index is sorted so we start our loop from 1st index and go
		 * till end using for loop.
		 */
		for (int i = 1; i < array.length; i++) {
			/*
			 * consider array has 2 parts[sorted | unsorted] atfirst[0th(consider sorted)|
			 * rest of elements unsorted] take 1 element from unsorted part and compare with
			 * each sorted part element
			 */
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > current) {
				// Keep swapping
				array[j + 1] = array[j];
				j--;

			}
			array[j + 1] = current;
		}
		printSortedArray(array);
	}
}
