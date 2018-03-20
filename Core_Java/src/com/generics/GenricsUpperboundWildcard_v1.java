package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenricsUpperboundWildcard_v1 {

	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<>();
		ints.add(3); ints.add(5); ints.add(10);
		double sum = sum(ints);
		System.out.println("Sum of ints="+sum);

		List<Double> doubles = new ArrayList<>();
		doubles.add(3.3); doubles.add(5.3); doubles.add(10.3);
		double doublesum = sum(doubles);

	}

	public static double sum(List<Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
	
}
