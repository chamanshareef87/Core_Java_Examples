package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample_v1 {

	public static void main(String[] args) {
		
		/*
		 * Here we are storing values withput any type specified
		 * you can observe the warning "ArrayList is a raw type"
		 * Problem here is it will accept anytype into it but while getting it back it will
		 * not check the type caste as a result you get a exception
		 */
		List list = new ArrayList();
		list.add("abc");
		
		list.add(new Integer(5)); //OK

		for(Object obj : list){
			//type casting leading to ClassCastException at runtime
		    String str=(String) obj;
		    System.out.println(str);
		}
		
	}

}
