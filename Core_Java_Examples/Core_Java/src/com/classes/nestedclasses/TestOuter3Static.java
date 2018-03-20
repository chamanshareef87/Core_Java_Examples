package com.classes.nestedclasses;

/*
 * will not comiple as static inner classes don't have access to 
 * non static member variables
 * 
 */
public class TestOuter3Static {

	int data=30;
	
	static class Inner{
		void message(){
			System.out.println("Static Data is:"+data);
		}
	}
	
	public static void main(String[] args) {
		TestOuter3Static.Inner inner = new TestOuter3Static.Inner();
		inner.message();
	}
}
