package com.java.datastructure;

public class PrimeNumber2DArray {
	/*
	 * declare 2D array
	 */
	 int[][] primeNoArray = new int[10][100];
	 /*
	  * Method for checking prime number
	  */
	    public void primeNumber() {
	        for(int i=2; i<1000; i++) {
	            int count = 0;
	            for(int j=2; j<=i; j++) {
	                if(i%j == 0) {
	                    count++;
	                }
	                if(count == 2) {
	                    break;
	                }
	            }
	            if(count==1) {
	                int index1 = i/100;
	                int index2 = i%100 -1 ;
	                primeNoArray[index1][index2] = i;
	            }
	        }
	    }
	    /*
	     * logic for show the prime numbers
	     */
	    public void display() {
	        System.out.println("Row 1");
	        int rowNo = 1;
	        for(int[] list: primeNoArray) {
	            rowNo++;
	            for(int prime: list) {
	                if(prime == 0) {
	                    continue;
	                }
	                System.out.print(prime + " ");
	            }
	            System.out.println();
	            if(rowNo == 11) {
	                return;
	            }
	            System.out.println("Row " + rowNo);
	           
	        }
	    }
	    /*
	     * program execution starts from main method
	     */
	    public static void main(String[] args) {
	    	PrimeNumber2DArray primeNumber = new PrimeNumber2DArray();
	    	primeNumber.primeNumber();
	    	primeNumber.display();

	    }
}
