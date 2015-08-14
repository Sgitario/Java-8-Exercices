package com.sgitario.coderbyte.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sgitario.utils.StringUtils;

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
		List<String> list = Arrays.asList(str.split(" "));

		return list.stream().collect(StringUtils.capitalize()).stream().collect(Collectors.joining(" "));

	}

	public static void main(String[] args) {
		// keep this function call here
		LetterCapitalize c = new LetterCapitalize();
		System.out.print(c.LetterCapitalize("hello world"));
	}
}
