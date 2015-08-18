package com.sgitario.book;

public class ReplaceWhiteString {
	
	public String replace(String input) {
		boolean space = false;
		StringBuffer buff = new StringBuffer();
		for (int n=0;n<input.length();n++) {
			char letter = input.charAt(n);
			
			if (letter != ' ') {
				if (space) {
					space = false;
					buff.append("%20");
				}
				
				buff.append(letter);
			} else if (buff.length() > 0) {
				space = true;
			}
		}

		return buff.toString();
	}
	
	public String replace2(String input) {
		String output = input.replaceAll("^[\\s]+", "");
		output = output.replaceAll("[\\s]+$", "");
		return output.replaceAll("\\s", "%s");
	}
	
	public static void main(String[] args) {
		ReplaceWhiteString c = new ReplaceWhiteString();
		
		System.out.print(c.replace2("  Mr John Smith    "));
	}
}
