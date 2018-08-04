package strings;


import java.util.*;

/*Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 A will consist at most  lower case english letters.*/

class Palindrome {
	
 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int i = A.length();
	        for (int k = 0 ; k<i/2;k++)
	        {
	            char c = A.charAt(k);
	            char d = A.charAt(i-1);
	            if (c == d)
	            {
	                i --;
	            }else
	            {
	                System.out.println("No");
	                System.exit(0);
	            }
	        }
	        System.out.println("Yes");
	        
	    }
	}
