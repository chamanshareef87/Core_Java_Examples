package com.langbasics;

public class PrimitiveDataTypeExamples {


	//Pritivite data types initialization is mandatory when they are using at method level
	public static void main(String[] args) {

		byte	bytevariable;
		short	shortVariable;
		int	intVariable;
		long longVariable;
		float	floatVariable;
		double	doubleVariabled;
		char	charVariable;
		boolean	booleanVariable;
		String strintVariable;
		
//		System.out.println(bytevariable);  //this will not execute
		bytevariable = 127;
		System.out.println(bytevariable);  //this will execute

		boolean result = true;
		char capitalC = 'C';
		byte b = 100;
		short s = 10000;
		int i = 100000;
		
		System.out.println("result::"+result);
		System.out.println("capitalC::"+capitalC);
		System.out.println("b::"+b);
		System.out.println("s::"+s);
		System.out.println("i::"+i);

		//Integer Literals
		// The number 26, in decimal
		int decVal = 26;
		//  The number 26, in hexadecimal
		int hexVal = 0x1a;
		// The number 26, in binary
		int binVal = 0b11010;
		System.out.println("decVal::"+decVal);
		System.out.println("hexVal::"+hexVal);
		System.out.println("binVal::"+binVal);
		
		//Floating-Point Literals
		double d1 = 123.4;
		// same value as d1, but in scientific notation
		double d2 = 1.234e2;
		float f1  = 123.4f;
		System.out.println("d1::"+d1);
		System.out.println("d2::"+d2);
		System.out.println("f1::"+f1);
		
		//Character and String Literals
		char c = '\u0108';
		System.out.println("c::"+c);
				
		//Using Underscore Characters in Numeric Literals
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		// Invalid: cannot put underscores
		// adjacent to a decimal point
//		float pi1 = 3_.1415F;
		// Invalid: cannot put underscores 
		// adjacent to a decimal point
//		float pi2 = 3._1415F;
		// Invalid: cannot put underscores 
		// prior to an L suffix
//		long socialSecurityNumber1 = 999_99_9999_L;

		
	}


	
	
}
