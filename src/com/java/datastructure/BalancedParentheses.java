package com.java.datastructure;
/**
 * imports all the class of the java.utill package
 */
import java.util.Stack;

public class BalancedParentheses {
	/*
	 * program execution starts from main method
	 */
	public static void main(String[] args) {
		Stack<Character> Stack = new Stack<>();
		String input = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '(') {
				Stack.push(ch);

			} else if (ch == ')') {
				Stack.pop();
			}
		}
		if (Stack.empty()) {
			System.out.println("Is Balanced Parantheses");
		} else {
			System.out.println("Is Balanced Parantheses");
		}
	}
}
