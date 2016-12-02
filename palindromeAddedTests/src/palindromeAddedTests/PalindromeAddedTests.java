/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeAddedTests;
import static kiss.API.*;
/**
 *
 * @author Cristina
 */
public class PalindromeAddedTests {
    
    //Java challenge: https://www.hackerrank.com/challenges/java-string-reverse
    
    void testNonPalindrome() {
      PalindromeAddedTests pal = new PalindromeAddedTests();

    assert pal.isPalindrome("chair") == false;
    assert pal.isPalindrome("book") == false;
    assert pal.isPalindrome("boot") == false;
    assert pal.isPalindrome("cup") == false;
    assert pal.isPalindrome("booooon") == false;
    
    }
    
    void testArePalindromes() {
       PalindromeAddedTests pal = new PalindromeAddedTests();
        
       assert pal.isPalindrome("bob") == true;
        assert pal.isPalindrome("racecar") == true;
        assert pal.isPalindrome("civic") == true;
        assert pal.isPalindrome("kayak") == true;
    }
    
    void testPalindromeSentence(){
        PalindromeAddedTests pal = new PalindromeAddedTests();
        assert pal.isPalindrome("in girum imus nocte et consumimur igni") == true;
        assert pal.isPalindrome("a santa at nasa") == true;
        assert pal.isPalindrome("ed is on no side") == true;
    }
   
    void testNonPalindromeSentence(){
        PalindromeAddedTests pal = new PalindromeAddedTests();
        assert pal.isPalindrome("in girum imus nocte et consuni") == false;
        assert pal.isPalindrome("a santa") == false;
        assert pal.isPalindrome("ed oo oo no") == false;
    }
    
    void testPalindromeWithCapitals() {
        PalindromeAddedTests pal = new PalindromeAddedTests();
        
        assert pal.isPalindrome("Drat Sadat a dastard") == true;
        assert pal.isPalindrome("Bush saw Sununu swash sub") == true;
        assert pal.isPalindrome("tacoCat") == true;
    }
    
    void testPalindromeWithPunction() {
        PalindromeAddedTests pal = new PalindromeAddedTests();
        
        assert pal.isPalindrome("Drat Sadat, a dastard") == true;
        assert pal.isPalindrome("No, it is open on one position") == true;
        assert pal.isPalindrome("Red? No. Who is it? 'Tis I. Oh, wonder!") == true;
    }
    
    boolean isPalindrome(String A){
        
       A = A.replaceAll("\\s+", "");
       A = A.replaceAll("\\W", "");
      
       A = A.toLowerCase();
       
       int length = A.length();
       int i;
       //int j = (length / 2);
       //boolean palindrome = true;

        for ( i = 0; i < (length/2); ++i)
        {
        if(A.charAt(i) != A.charAt(length - i - 1))
            {
                 return false;
             }        
        }
       return true;
        
    }
     
}
