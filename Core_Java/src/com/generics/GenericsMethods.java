package com.generics;

public class GenericsMethods {

	//Java generic methods
	public static <T> boolean isEqual(GenericType<T> t1, GenericType<T> t2){
		return t1.getT().equals(t2.getT());
	}
	
	
	public static void main(String[] args){
		
		GenericType<String> g1 = new GenericType<>();
		g1.setT("Chaman");
		
		GenericType<String> g2 = new GenericType<>();
		g2.setT("Chaman");
		
		boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
		
		//above statement can be written simply as
		isEqual = GenericsMethods.isEqual(g1, g2);
		
		System.out.println(isEqual);
		
		//This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
		//Compiler will infer the type that is needed
		
	}
	
	
}
