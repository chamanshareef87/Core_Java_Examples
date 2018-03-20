package com.onlinetest;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		//problem 1
		Test t = new Test();
		int i = t.check();
		System.out.println(i);
		
		//problem 2
		byte b =1;
		b+=1;
		System.out.println(b);
		
		
	}
	
	int check() {
		try {
			throw new IOException();
			
		} catch (Exception e) {
			System.out.println("catch block");
			return 1;
		}finally {
			System.out.println("finally returning");
			return 2;
		}
	}
}
