package com.generics;

public class GenericsBoudedTypeExample {

	public static <T> int countGreaterThan(T[] anArray, T elem) {
	    int count = 0;
	    for (T e : anArray)
//	        if (e > elem)  // compiler error
	            ++count;
	    return count;
	}
	
	
	public static void main(String[] args) {

		
	}

	
}
