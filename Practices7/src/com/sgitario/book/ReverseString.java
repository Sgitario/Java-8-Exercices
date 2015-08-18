package com.sgitario.book;

public class ReverseString {
	public String reverse(String str) {
		StringBuffer buffer = new StringBuffer();
		for (int index = str.length() - 1; index >= 0; index--) {
			buffer.append("" + str.charAt(index));
		}
		
		return buffer.toString();
	}
	
	public static void main(String[] args) {
		ReverseString c = new ReverseString();
		
		System.out.print(c.reverse("hola"));
	}
}
