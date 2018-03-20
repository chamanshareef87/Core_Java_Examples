package com.equal.hashcode;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		testv1();
		testv2();
		testv3();
		
	}

	private static void testv1() {
		System.out.println("===================v1======================");
		Employee_v1 e1 = new Employee_v1();
		
        Employee_v1 e2 = new Employee_v1();
 
        e1.setId(100);
        e2.setId(100);
 
        /*Even though these two objects have details of same employee 
        	equals method will print false.
        	this is because equals compares the references of two objects not the content
        */
        //Prints false in console
        System.out.println(e1.equals(e2));
        
        Employee_v1 e3 = e1;
        
        //Prints true as both are referencing to the same object
        System.out.println(e1.equals(e3));

        //Default hascode of an object.
        //Hashcode is a memory location of an object
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
		
	}

	private static void testv2() {
		System.out.println("===================v2======================");
		Employee_v2 e1 = new Employee_v2();
        Employee_v2 e2 = new Employee_v2();
 
        e1.setId(100);
        e2.setId(100);
 
        //Prints 'true'
        System.out.println(e1.equals(e2));
 
        Set<Employee_v2> employees = new HashSet<Employee_v2>();
        employees.add(e1);
        employees.add(e2);
         
		/* Prints two objects, if both the objects are same then set should
		* print only one object not two
        * This is because we are missing import method override hashcode method
        */
		System.out.println(employees);
        //Ideally these should have been a same object
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        
	}

	
	private static void testv3() {
		System.out.println("===================v3======================");
		Employee_v3 e1 = new Employee_v3();
        Employee_v3 e2 = new Employee_v3();
 
        e1.setId(100);
        e2.setId(100);
 
        //Prints 'true'
        System.out.println(e1.equals(e2));
 
        Set<Employee_v3> employees = new HashSet<Employee_v3>();
        employees.add(e1);
        employees.add(e2);
         
		System.out.println(employees);

		System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        
	}

}
