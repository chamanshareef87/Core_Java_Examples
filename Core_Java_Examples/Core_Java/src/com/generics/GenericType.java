package com.generics;

public class GenericType<T> {

	private T t;
	
	public T getT() {
		return t;
	}


	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		
		GenericType<String> type = new GenericType<>();
		type.setT("pankaj");
		System.out.println(type.getT());
		
		GenericType type1 = new GenericType(); //raw type
		type1.setT("Pankaj"); //valid
		type1.setT(10); //valid and autoboxing support		
		
		
	}

	
}
