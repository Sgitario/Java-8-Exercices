package com.sgitario.coderbyte.easy;

import java.util.Arrays;

public class FirstReverse {
	String FirstReverse(String str) {
		
		String output = "";
		
		for (int index = 0; index < str.length(); index++) {
			output = "" + str.charAt(index) + output; 
		}
		
		return output;
	}

	public static void main(String[] args) {
		FirstReverse c = new FirstReverse();
		System.out.print(c.FirstReverse("coderbyte"));
	}
}
