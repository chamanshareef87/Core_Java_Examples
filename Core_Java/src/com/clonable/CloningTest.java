package com.clonable;

import java.util.HashMap;
import java.util.Map;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		testclonev1();
		testclonev2();
		testclonev3();
		testclonev4CopyConstructor();

	}

	private static void testclonev4CopyConstructor() {
		System.out.println("==================================");
		System.out.println("using copy constructor");		
		Employee_cv2 emp_1v2 = new Employee_cv2();
		emp_1v2.setId(1);
		emp_1v2.setName("Pankaj");
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Bangalore");
		emp_1v2.setProps(props);
		
		Employee_cv2 clonedEmp_1v2 = new Employee_cv2(emp_1v2);

		// Check whether the emp and clonedEmp attributes are same or different
		// prints false confirming these are two different objects
		System.out.println("emp_1v2 and clonedEmp_1v2 == test: " + (emp_1v2 == clonedEmp_1v2));
		// prints true indicates these are two objects are same getProps
		System.out.println("emp_1v2 and clonedEmp_1v2 propery type:: " + (emp_1v2.getProps() == clonedEmp_1v2.getProps()));
		System.out.println(emp_1v2);
		System.out.println(clonedEmp_1v2);
		// change emp name
		emp_1v2.setName("new name");
		emp_1v2.setId(2);
		clonedEmp_1v2.getProps().put("salary", "20000");
		clonedEmp_1v2.getProps().put("city", "New York");
		
		System.out.println("emp_1v1::"+emp_1v2);
		System.out.println("clonedEmp_1v1::"+clonedEmp_1v2);
		
	}

	private static void testclonev3()  throws CloneNotSupportedException {
		System.out.println("==================================");
		System.out.println("Working with Non primitive types during clone");		
		Employee_cv1 emp_1v1 = new Employee_cv1();
		emp_1v1.setId(1);
		emp_1v1.setName("Pankaj");
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Bangalore");
		emp_1v1.setProps(props);
		
		Employee_cv1 clonedEmp_1v1 = (Employee_cv1) emp_1v1.clone();

		// Check whether the emp and clonedEmp attributes are same or different
		// prints false confirming these are two different objects
		System.out.println("emp_1v1 and clonedEmp_1v1 == test: " + (emp_1v1 == clonedEmp_1v1));
		// prints true indicates these are two objects are same getProps
		System.out.println("emp_1v1 and clonedEmp_1v1 propery type:: " + (emp_1v1.getProps() == clonedEmp_1v1.getProps()));
		System.out.println(emp_1v1);
		System.out.println(clonedEmp_1v1);
		// change emp name
		emp_1v1.setName("new name");
		emp_1v1.setId(2);
		clonedEmp_1v1.getProps().put("salary", "20000");
		clonedEmp_1v1.getProps().put("city", "New York");
		
		System.out.println("emp_1v1::"+emp_1v1);
		System.out.println("clonedEmp_1v1::"+clonedEmp_1v1);
		
	}

	private static void testclonev2() throws CloneNotSupportedException {
		
		System.out.println("==================================");
		System.out.println("Non primitive types in the class and their behaviour");		

		Employee_c emp_1 = new Employee_c();
		emp_1.setId(1);
		emp_1.setName("Pankaj");
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Bangalore");
		emp_1.setProps(props);
		
		Employee_c clonedEmp_1 = (Employee_c) emp_1.clone();

		// Check whether the emp and clonedEmp attributes are same or different
		// prints false confirming these are two different objects
		System.out.println("emp_1 and clonedEmp_1 == test: " + (emp_1 == clonedEmp_1));
		// prints true indicates these are two objects are same getProps
		System.out.println("emp_1 and clonedEmp_1 propery type:: " + (emp_1.getProps() == clonedEmp_1.getProps()));
		System.out.println(emp_1);
		System.out.println(clonedEmp_1);
		// change emp name
		emp_1.setName("new name");
		emp_1.setId(2);
		clonedEmp_1.getProps().put("salary", "20000");
		clonedEmp_1.getProps().put("city", "New York");
		
		System.out.println("emp_1::"+emp_1);
		System.out.println("clonedEmp_1::"+clonedEmp_1);
		/* Please note props properties are getting changed as you change in one
		 object
		 */
		
	}

	private static void testclonev1() throws CloneNotSupportedException {
		Employee_c emp = new Employee_c();
		emp.setId(1);
		emp.setName("Pankaj");

		Employee_c clonedEmp = (Employee_c) emp.clone();

		// Check whether the emp and clonedEmp attributes are same or different
		System.out.println("emp and clonedEmp == test: " + (emp == clonedEmp)); // prints false confirming these are two different objects
		System.out.println(emp);
		System.out.println(clonedEmp);
		// change emp name
		emp.setName("new name");
		emp.setId(2);
		System.out.println(emp);
		System.out.println(clonedEmp);
		
	}

}
