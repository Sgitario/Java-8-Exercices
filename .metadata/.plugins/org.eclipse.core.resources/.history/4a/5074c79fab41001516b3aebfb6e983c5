package com.sgitario.chapter6;

public class DashInsertII {
	String DashInsertII(String num) {
		String[] str = num.split("");
		
		int previous = getNum(str[1]);
		String output = "" + previous;
		
		for (int index = 2; index < str.length; index++) {
			int item = getNum(str[index]);
			if (isOdd(item) && isOdd(previous)) {
				output += "-"; 
			} else if (!isOdd(item) && !isOdd(previous)) {
				output += "*"; 
			}
			
			output += "" + item;
			previous = item;
		}

		return output;
	}
	
	boolean isOdd(int num) {
		return num % 2 == 1;
	}
	
	int getNum(String ch) {
		return Integer.valueOf(ch);
	}

	public static void main(String[] args) {
		DashInsertII c = new DashInsertII();
		
		System.out.print(c.DashInsertII("99946"));
	}
}
