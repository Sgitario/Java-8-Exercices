package com.sgitario.book;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class PowerSet {
	
	private Collection<String> powerset(int[] arr) {
		return recursive(arr, arr.length, null);
		// return iterative(arr);
	}
	
	private Set<String> recursive(int[] arr, int n, Set<String> collection) {
		if (n == 0) {
			// initialize
			collection = new LinkedHashSet<String>();
			collection.add("");
			return collection;
		} else if (n > 0) {
			collection = recursive(arr, n - 1, collection);
			
			Set<String> childs = new LinkedHashSet<String>();
			for (String str : collection) {
				childs.add(str + arr[n - 1]);
			}
			
			collection.addAll(childs);
		}
		
		return collection;
	}
	
	private Set<String> iterative(int[] arr) {
		Set<String> collection = new LinkedHashSet<String>();
		collection.add("");
		for (int n = 0; n < arr.length; n++) {
			
			Set<String> childs = new LinkedHashSet<String>();
			for (String item : collection) {
				childs.add(item + arr[n]);
			}
			
			collection.addAll(childs);
		}
		
		return collection;
	}
	
	public static void main(String[] args) {
		PowerSet c = new PowerSet();
		
		System.out.println(c.powerset(new int[] {1,2,3,4}));
		System.out.println("Count=" + c.powerset(new int[] {1,2,3,4}).size());
	}
}
