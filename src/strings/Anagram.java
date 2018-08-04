package strings;

import java.util.Arrays;
import java.util.Scanner;

//whether the given two strings are anagrams or not ignoring case sensitives

public class Anagram {
	
	static int NO_OF_CHARS = 256;
	
	static boolean isAnagram(String a, String b) {
		
		// spaces, punctuation, case don't count
					String pattern = "[\\s\\p{P}]";
					a = a.replaceAll(pattern, "").toLowerCase();
					b = b.replaceAll(pattern, "").toLowerCase();
		
		if (a.length()!=b.length()){
			return false;
			}
		char str1[]=a.toCharArray();
		char str2[]=b.toCharArray();
		
		int count1[] = new int[NO_OF_CHARS];
		Arrays.fill(count1, 0);
		int count2[] = new int[NO_OF_CHARS];
		Arrays.fill(count2, 0);
		int i;
		
		for ( i = 0; i < a.length();i++)
		{
			count1[str1[i]]++;
			count2[str2[i]]++;
		}
		for (i=0;i<NO_OF_CHARS;i++)
			if(count1[i] != count2[i])
				return false;
		return true;
		
	}
	
	 public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

/* Easy solution by using array functions
 * 
 * 
 * 	static boolean areAnagrams(String phrase1, String phrase2)
	{
		if (phrase1 != null && phrase2 != null && phrase1.length() > 0 && phrase2.length() > 0)
		{
			// spaces, punctuation, case don't count
			String pattern = "[\\s\\p{P}]";
			phrase1 = phrase1.replaceAll(pattern, "").toLowerCase();
			phrase2 = phrase2.replaceAll(pattern, "").toLowerCase();
 
			if (phrase1.equals(phrase2)) {
				// same phrase is not an anagram
				return false;
			}
 
			// convert to array and sort
			char[] phr1Array = phrase1.toCharArray();
			char[] phr2Array = phrase2.toCharArray();
			Arrays.sort(phr1Array);
			Arrays.sort(phr2Array);
 
			if (Arrays.equals(phr1Array, phr2Array))
			{
				return true;
			}
		}
 
		return false;
	}

 */

