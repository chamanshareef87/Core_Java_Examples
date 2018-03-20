package com.generics;

public class GenericsExample_v3 {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
		
	}
        public static void main(String args[]){
        	GenericsExample_v3 type = new GenericsExample_v3();
		type.set("Pankaj"); 
		String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
		System.out.println(str);
	}
        

}
