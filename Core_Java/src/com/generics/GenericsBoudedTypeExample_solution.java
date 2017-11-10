package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsBoudedTypeExample_solution {

	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
	    int count = 0;
	    for (T e : anArray)
	        if (e.compareTo(elem) > 0)
	            ++count;
	    return count;
	}
	
	
	public static void main(String[] args) {

		int[] anArray = {10,20,30};
		T t = new GenericsBoudedTypeExample_solution();
		
		countGreaterThan(anArray, anArray[1]);
		
		
	}

	
}
