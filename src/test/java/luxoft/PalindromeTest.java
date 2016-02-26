/**
 * 
 */
package luxoft;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.luxoft.palindrome.Palindrome;


/**
 * @author Jair
 *
 */
public class PalindromeTest {
	private String word;
	Palindrome palindrome;
	
	@Before
	public void init(){
		palindrome=new Palindrome();
	}
	
	@Test
	public void testIsPalindrome(){
		word="otto";
		assertTrue(palindrome.isPalindrome(word));
	}
	
	@Test
	public void testIsPalindromeUpperCase(){
		word="Otto";
		assertTrue(palindrome.isPalindrome(word));
	}
	
	@Test
	public void testIsNotPalindrome(){
		word="kitchen";
		assertFalse(palindrome.isPalindrome(word));
	}
}
