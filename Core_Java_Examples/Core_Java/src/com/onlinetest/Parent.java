package com.onlinetest;

public class Parent {

	static {
		System.out.println("Static parent");
	}
	public Parent() {
		System.out.println("Parent constructor");
	}
	
}


class Child extends Parent{
	
	static {
		System.out.println("Static child");
	}
	
	public Child(int i) {
		System.out.println("Child constructor");
	}
	
	public static void main(String[] args) {
		Parent p;
	}
	
}