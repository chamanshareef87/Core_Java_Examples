package com.classes.nestedclasses;

/*
 * Static class, static data, static method
 * 
 */
public class TestOuter2Static {

	static int data=30;
	
	static class Inner{
		static void message(){
			System.out.println("Static Data is:"+data);
		}
	}
	
	public static void main(String[] args) {
		//Method accessed in static way
		TestOuter2Static.Inner.message();
	}
}
