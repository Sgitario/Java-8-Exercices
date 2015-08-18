package com.sgitario.book;

/**
 * Having two integers, check whether are equals without using any comparators.
 * 
 * @author jhilario
 *
 */
public class IsEqual {
	
	public int isEquals(int x, int y) {
		int t = (x - y) | (y - x); // <0 iff x != y, 0 otherwise
		t >>= 31; // -1 iff x != y, 0 otherwise
		return 1 + t; // 0 iff x != y, 1 otherwise
	}
	
	public static void main(String[] args) {
		IsEqual c = new IsEqual();
		
		System.out.print(c.isEquals(2, -2));
	}
}
