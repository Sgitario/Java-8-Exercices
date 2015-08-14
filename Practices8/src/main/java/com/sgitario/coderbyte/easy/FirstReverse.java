package com.sgitario.coderbyte.easy;

import java.util.Arrays;

import com.sgitario.utils.ReverseCollector;

public class FirstReverse {
	String FirstReverse(String str) {
		return Arrays.asList(str.split(""))
			.stream()
				.collect(new ReverseCollector())
			.toString();

	}

	public static void main(String[] args) {
		FirstReverse c = new FirstReverse();
		System.out.print(c.FirstReverse("coderbyte"));
	}
}
