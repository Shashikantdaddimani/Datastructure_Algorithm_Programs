package com.java.datastructure;
/**
 * imports all the class of the java.utill package
 */
import java.util.Arrays;
import java.util.Scanner;

public class SearchAndSortArray {
	 public static <T> void searchAndSort(T []array,T word){
	        
	        Arrays.sort(array);       
	        if (Arrays.binarySearch(array,word)>=0){
	            System.out.println(word + " is Found in the array list");
	        }
	        else {
	            System.out.println(word + " is not Found in the array list");
	        }
	    }
	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	        /*
	         *  Declaring the Integer number And Assigning  Integer number to the  Integer array 
	         * and Checking the Integer number
	         */
	      
	        Integer []intArray = {1,12,8,4,5,9,7,14,6,9,8,4,2,5};
	        System.out.println("Enter the Integer number");
	        Integer intNumber = input.nextInt();
	        searchAndSort(intArray,intNumber);
	        /*
	         *  Declaring the Float number And Assigning  Float number to the  Float array 
	         * and Checking the Float number
	         */
	        
	        
	        Float []floatArray = {1.6f,9.6f,14.8f,7.5f,6.9f};
	        System.out.println("Enter Float number");
	        Float floatNumber =input.nextFloat();
	        
	        searchAndSort(floatArray,floatNumber);
	        /*
	         * Declaring the String And Assigning String to the  String array 
	         * and Checking the String word
	         */
	        
	        String []stringArray = {"ramesh","shashi","kiran","geeta","navya"};
	        System.out.println("Enter the String ");
	        String stringWord = input.next();
	        searchAndSort(stringArray,stringWord);

	    }
}
