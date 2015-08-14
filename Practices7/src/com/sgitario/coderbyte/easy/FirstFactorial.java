package com.sgitario.coderbyte.easy;

/**
 * Using the Java language, have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it (ie. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18. 
 * 
 * Use the Parameter Testing feature in the box below to test your code with different arguments.
 * @author jhilario
 *
 */
public class FirstFactorial {
	int FirstFactorial(int num) {
		int output = 1;
		for (int index = num; index > 1; index--) {
			output *= index;
		}
		
	    return output;
	    
	  } 
	  
	  public static void main (String[] args) {  
	    FirstFactorial c = new FirstFactorial();
	    System.out.print(c.FirstFactorial(4)); 
	  }   
}
