package com.sgitario.coderbyte.easy;

import java.util.Arrays;

import com.sgitario.utils.StringUtils;

/**
 * Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. 
 * 
 * Use the Parameter Testing feature in the box below to test your code with different arguments.
 * @author jhilario
 *
 */
public class LongestWord {
	String LongestWord(String sen) { 		
		return Arrays.asList(sen.replaceAll("[^a-zA-Z ]", "")
				.split(" "))
				.stream()
					.max(StringUtils::max).get();
	  } 
	  
	  public static void main (String[] args) {  
	    LongestWord c = new LongestWord();
	    System.out.print(c.LongestWord("caybeyadadgoes Argument baybeyadadgoes! here")); 
	  }   
}
