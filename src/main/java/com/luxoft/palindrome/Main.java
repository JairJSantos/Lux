/**
 * 
 */
package com.luxoft.palindrome;

import java.util.Scanner;

/**
 * @author Jair
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		Palindrome palindrome=new Palindrome();
		String  inString;
		
		
		inString=in.nextLine();
		
		if(palindrome.isPalindrome(inString))
			System.out.println(inString + " is a PALINDROME");
		else
			System.out.println(inString + " is NOT A PALINDROME.");
	}

}
