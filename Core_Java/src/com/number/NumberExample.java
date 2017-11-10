package com.number;

public class NumberExample {

	public static void main(String[] args){
		Number number = 123.21;
		
		//Methods of Number class
		byte bytevalue = number.byteValue();
		short  svalue = number.shortValue();
		int  ivalue = number.intValue();
		long  lvalue = number.longValue();
		float  fvalue = number.floatValue();
		double  dvalue = number.doubleValue();
		
		System.out.println(bytevalue);
		System.out.println(svalue);
		System.out.println(ivalue);
		System.out.println(lvalue);
		System.out.println(fvalue);
		System.out.println(dvalue);
		
		
		Number num1 = 222;
		Number num2 = 333;
		System.out.println(num1.equals(num2));

		Number num3 = num1;
		System.out.println(num1.equals(num3));
		
		
		
	}
	
}
