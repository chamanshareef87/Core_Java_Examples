package com.serialization;

import java.io.IOException;

/*
 * Reference https://www.journaldev.com/2452/serialization-in-java
 * 
 */
/*
 * Run this method on already serialized file from previous test class.
 * 
 * Now uncomment the “password” variable and it’s getter-setter methods from Employee class and run it. You will get exception;
 */

/*
 * The reason is clear that serialVersionUID of the previous class 
 * and new class are different. 
 * Actually if the class doesn’t define serialVersionUID, it’s getting calculated automatically 
 * and assigned to the class. Java uses class variables, methods, class name, 
 * package etc to generate this unique long number.
 */

public class DeserializationTest {

	
	public static void main(String[] args) {

		String fileName="employee.ser";
		EmployeeS_v1 empNewS_v1 = null;
		
		try {
			empNewS_v1 = (EmployeeS_v1) SerializationUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("empNewS_v1 Object::"+empNewS_v1);
		
	}
}
