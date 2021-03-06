package com.sgitario.coderbyte.easy;

/**
 * Using the Java language, have the function LetterCapitalize(str) take the str
 * parameter being passed and capitalize the first letter of each word. Words
 * will be separated by only one space.
 * 
 * Use the Parameter Testing feature in the box below to test your code with
 * different arguments.
 * 
 * @author jhilario
 *
 */
public class LetterCapitalize {
	String LetterCapitalize(String str) {
		StringBuilder output = new StringBuilder();
		String[] arr = str.split(" ");
		for (String s : arr) {			
			if (output.length() > 0) {
				output.append(" ");
			}
			
			output.append(s.substring(0, 1).toUpperCase() + s.substring(1));
		}

		return output.toString();

	}

	public static void main(String[] args) {
		// keep this function call here
		LetterCapitalize c = new LetterCapitalize();
		System.out.print(c.LetterCapitalize("hello world"));
	}
}
