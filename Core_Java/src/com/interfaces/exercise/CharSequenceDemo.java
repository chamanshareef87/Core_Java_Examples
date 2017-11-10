package com.interfaces.exercise;

public class CharSequenceDemo implements CharSequence {

	String charSequence = "Hello chaman shareef";
	@Override
	public int length() {
		return charSequence.length();
	}

	@Override
	public char charAt(int index) {
		return charSequence.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return charSequence.substring(start, end);
	}

	
	public static void main(String[] args){
		
		CharSequence charSequence = new CharSequenceDemo();
		System.out.println(charSequence.length());
		System.out.println(charSequence.charAt(6));
		System.out.println(charSequence.subSequence(4, 15));
		
	}
	
}

