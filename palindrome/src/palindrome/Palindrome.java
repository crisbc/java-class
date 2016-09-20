/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Cristina
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     //Java challenge: https://www.hackerrank.com/challenges/java-string-reverse
        
        //String A = sc.next();
        String A;
        A = "madam";
       int length = A.length();
       int i;
       int j = length - 1;
       int palindrome = 0;
       
        for ( i =0; i < j; i++)
        {
        if(A.charAt(i) != A.charAt(j))
            {
                 palindrome = 1;
             }
                else{ 
                        palindrome = 0;
                    }  
                  j--;      
        }
    if(palindrome == 1)
    {
        System.out.print("No");
    }
    else if (palindrome == 0)
        System.out.print("Yes");
    }
    
    
}

