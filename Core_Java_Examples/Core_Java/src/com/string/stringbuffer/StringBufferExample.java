package com.string.stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		int sbLength = sb.length();
		int sbCapacity = sb.capacity();
		System.out.println("String Length of " + sb + " is " + sbLength);
		System.out.println("Capacity of " + sb + " is " + sbCapacity);

		/*
		 * append(): appends the specified argument string representation at the end of
		 * the existing String Buffer. This method is overloaded for all the primitive
		 * data types and Object.
		 */
		sb.append("World ");
		sb.append(2018);
		System.out.println(sb);

		/*
		 * insert(): insert() method takes two parameters – the index integer value to
		 * insert a value and the value to be inserted. The index tells StringBuffer
		 * where to insert the passed character sequence. Again this method is
		 * overloaded to work with primitive data types and Objects.
		 */
		sb.insert(5, " ");
		sb.insert(sb.length(), 2017);
		System.out.println(sb);
		
		/*
		 * reverse(): Reverses the existing String or character sequence content in the
		 * buffer and returns it. The object must have an existing content or else a
		 * NullPointerException is thrown.
		 */
		System.out.println(sb.reverse());
		
	}
	
}
