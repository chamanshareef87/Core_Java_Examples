package com.serialization;

import java.io.IOException;

/*
 * Since salary is a transient variable, it’s value was not saved to
 * file and hence not retrieved in the new object. Similarly static
 * variable values are also not serialized since they belongs to class
 * and not object.
 */
/*
 * Reference https://www.journaldev.com/2452/serialization-in-java
 */
public class SerializationTest {

	public static void main(String[] args) {
		String fileName="employee.ser";
		EmployeeS_v1 empS_v1 = new EmployeeS_v1();
		empS_v1.setId(100);
		empS_v1.setName("Pankaj");
		empS_v1.setSalary(5000);
		
		//serialize to file
		try {
			SerializationUtil.serialize(empS_v1, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		EmployeeS_v1 empNewS_v1 = null;
		try {
			empNewS_v1 = (EmployeeS_v1) SerializationUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("empS_v1 Object::"+empS_v1);
		System.out.println("empNewS_v1 Object::"+empNewS_v1);
		
	}
}
