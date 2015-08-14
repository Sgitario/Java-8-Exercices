package com.sgitario.coderbyte.easy;

/**
 * Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. 
 * 
 * Use the Parameter Testing feature in the box below to test your code with different arguments.
 * @author jhilario
 *
 */
public class LongestWord {
	String LongestWord(String sen) { 
		String[] str = sen.replaceAll("[^a-zA-Z ]", "")
				.split(" ");
		
		int max = Integer.MIN_VALUE;
		String maxStr = "";
		for (String s : str) {
			if (max < s.length()) {
				max = s.length();
				maxStr = s;
			}
		}
		
	    return maxStr;
	  } 
	  
	  public static void main (String[] args) {  
	    LongestWord c = new LongestWord();
	    System.out.print(c.LongestWord("Argument goes! here")); 
	  }   
}
