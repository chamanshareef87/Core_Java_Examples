package com.classes.nestedclasses;

/*
 * Static class, static data
 * 
 */
public class TestOuter1Static {

	static int data=30;
	
	static class Inner{
		void message(){
			System.out.println("Static Data is:"+data);
		}
	}
	
	public static void main(String[] args) {
		//Inner class instance created in static way
		
		TestOuter1Static.Inner inner = new TestOuter1Static.Inner();
		inner.message();
	}
}
