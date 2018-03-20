package com.lambda.basic.uint1;

public class TypeInterfaceExample {

	public static void main(String[] agrs){
		StringLengthLambda mylambda_v1 = (String s) -> s.length();
		StringLengthLambda mylambda_v2 = (s) -> s.length();
		StringLengthLambda mylambda_v3 =  s -> s.length();
		System.out.println(mylambda_v1.getLength("Hello lambda"));
		System.out.println(mylambda_v2.getLength("Hello lambda"));
		System.out.println(mylambda_v3.getLength("Hello lambda"));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}
}
