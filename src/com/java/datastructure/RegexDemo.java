package com.java.datastructure;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	/*
	 * Declaring the variables
	 */
	String firstName;
	String fullName; 
	String contactNumber;
	String date; 
	/*
	 *  Declaring the Given standard message
	 */
	String message = "Hello <<name>>, We have your full " + "name as <<full name>> in our system. \nYour "
			+ "contact number is 91-xxxxxxxxxx." + " \nPlease,let us know in case of any"
			+ " clarification. \nThank you BridgeLabz 01/01/2016.";

	/*
	 * calls required methods
	 */
	public void stringToBeReplaced() {
		/*get user information
		 * replace first name
		 * replace full name
		 * replace contact number
		 * replace date
		 * Print the Given Message
		 */
		getUserInfo(); 
		replace("<<name>>", firstName); 
		replace("<<full name>>", fullName); 
		replace("xxxxxxxxxx", contactNumber); 
		replace("01/01/2016", date); 
		System.out.println(message); 
	}

	/*
	 *  user to provide information and stores in respective variables
	 */
	void getUserInfo() {
		/*
		 * scanner to get user input
		 */
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter your first name: ");
		firstName = input.nextLine();
		System.out.print("Enter your full name: ");
		fullName = input.nextLine();
		System.out.print("Enter your contact number: ");
		contactNumber = input.nextLine();
		System.out.print("Enter date in dd/mm/yyyy format: ");
		date = input.nextLine();
		input.close();
	}

	/*
	 *  stringToBeReplaced
	 *  replacement       
	 *  Replaces string 'stringToBeReplaced' in message with given 'replacement'
	 */
	void replace(String stringToBeReplaced, String replacement) {
		Pattern pattern = Pattern.compile(stringToBeReplaced); // pattern
		Matcher matcher = pattern.matcher(message); // matcher
		message = matcher.replaceFirst(replacement);
	}
	/*
	 * Execution Start from main Method
	 */
	public static void main(String[] args) {
		/*
		 * Class Object
		 */
		RegexDemo Object = new RegexDemo(); // class object
		Object.stringToBeReplaced();
	}
}
