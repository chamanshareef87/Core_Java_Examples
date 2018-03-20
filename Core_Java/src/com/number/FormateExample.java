package com.number;

import java.util.Calendar;
import java.util.Locale;

public class FormateExample {

	public static void main(String[]  args){

		float floatVar = 12.12f;
		int intVar = 123;
		String stringVar = "AM STRIGN";
		
		System.out.format("The value of " + "the float variable is " +
			     "%f, while the value of the " + "integer variable is %d, " +
			     "and the string is %s", floatVar, intVar, stringVar); 
		
		int i = 461012;
		//The %d specifies that the single variable is a decimal integer. The %n is a platform-independent newline character. The output is:
		System.out.format("The value of i is: %d%n", i);

		
		long n = 461012;
	      System.out.format("%d%n", n);      //  -->  "461012"
	      System.out.format("%08d%n", n);    //  -->  "00461012"
	      System.out.format("%+8d%n", n);    //  -->  " +461012"
	      System.out.format("%,8d%n", n);    // -->  " 461,012"
	      System.out.format("%+,8d%n%n", n); //  -->  "+461,012"
	      
	      double pi = Math.PI;

	      System.out.format("%f%n", pi);       // -->  "3.141593"
	      System.out.format("%.3f%n", pi);     // -->  "3.142"
	      System.out.format("%10.3f%n", pi);   // -->  "     3.142"
	      System.out.format("%-10.3f%n", pi);  // -->  "3.142"
	      System.out.format(Locale.FRANCE,
	                        "%-10.4f%n%n", pi); // -->  "3,1416"

	      Calendar c = Calendar.getInstance();
	      System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

	      System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

	      System.out.format("%tD%n", c);    // -->  "05/29/06"
	}
	
}
