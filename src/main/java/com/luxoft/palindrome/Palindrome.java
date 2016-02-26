/**
 * 
 */
package com.luxoft.palindrome;

/**
 * @author Jair
 *
 */
public class Palindrome {

	public boolean isPalindrome(String word){
		word=word.toUpperCase();
		
		if(word.length()==1)
			return true;
		else if(word.length()==2){
			
			if(word.charAt(0)==word.charAt(word.length() - 1)){
				return true;
			}

		}
		else{
			
			if(word.charAt(0)==word.charAt(word.length() - 1)){
				return isPalindrome(word.substring(1,word.length() - 1));
			}
			else
				return false;
		}
		
		return false;
	}

}
