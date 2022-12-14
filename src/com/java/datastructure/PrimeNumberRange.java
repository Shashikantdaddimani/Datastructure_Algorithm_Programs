package com.java.datastructure;

/**
 * imports the scanner class of the java.utill package
 */

public class PrimeNumberRange {
	/*
	 * program execution starts from main method
	 */
	public static void main(String[] args) {

		System.out.println("Range 0-1000 prime number is : ");
		/*
		 * Logic for finding The Prime Numbers Between 0 to 1000;
		 */
		int start = 0;
		int stop = 1000;
		for (int i = start; i <= stop; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
	}
	/*
	 * Logic for checking a Number is primeNumber 
	 */
	private static boolean isPrime(int number) {
		if (number < 2)
			return true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
