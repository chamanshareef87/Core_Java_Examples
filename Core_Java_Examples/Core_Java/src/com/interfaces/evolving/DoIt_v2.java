package com.interfaces.evolving;

public interface DoIt_v2 {

	 void doSomething(int i, double x);
	 int doSomethingElse(String s);

	 /*
	  * This will enforce all implementing classes to implement this new method.
	  */
	//boolean didItWork(int i, double x, String s);

	 /*
	  * Alternatively you can define default methods
	  */
	 default String didItWork(int i, double x, String s) {
		System.out.println(
				"Default methods enable you to add new functionality to interface without affecting implementation classes.");
		 return "Am from interface";
	 }
	 
}
