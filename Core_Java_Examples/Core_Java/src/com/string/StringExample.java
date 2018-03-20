package com.string;

public class StringExample {
	
	public static void main(String[] args) {
		//Creating string
		String s1 = "abc";
		String s2 = new String("abc");
		
		//== and equal
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		/*
		 * Here JVM will look for literal "abc" in string pool
		 * if it finds one it will return reference of it
		 * but in above example new String() it will always create new object
		 */
		String s3 = "abc";
		System.out.println(s1==s3);
		
		char[] a = {'a', 'b', 'c'};
		String s4  =  new String(a);
		
		System.out.println(s3);
		s3.toUpperCase();
		System.out.println(s3);
		s3 = s3.toUpperCase();
		System.out.println(s3);

	}
	
}
