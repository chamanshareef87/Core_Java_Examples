package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample_v2 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>(); // java 7 ? List<String> list1 = new ArrayList<>(); 
		list1.add("abc");
//		list1.add(new Integer(5)); //compiler error

		for(String str : list1){
		     //no type casting needed, avoids ClassCastException
			System.out.println(str);
		}
		
	}

}
