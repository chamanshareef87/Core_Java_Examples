package com.string.stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("World");// now original string is changed
		System.out.println(sb);// prints Hello World

		sb.insert(4, "o ");
		System.out.println(sb);// prints Hello World
		
		sb.delete(4,6);
		
		System.out.println(sb);// prints Journal
		
		sb.replace(6,11,"Earth");

		System.out.println(sb);// prints Hello Earth!
		
	}

}
