package com.classes.nestedclasses.lambdaExp;

import java.util.ArrayList;
import java.util.List;

public class Approach3 {

	//Specify Search Criteria Code in a Local Class
	
	public static void main(String[] args) {

		List<Person> roster = new ArrayList<Person>();
		Person p = new Person();
		p.setAge(30);
		p.setGender(Person.Sex.FEMALE);
		p.setName("A");
		roster.add(p);
		
		p = new Person();
		p.setAge(20);
		p.setGender(Person.Sex.MALE);
		p.setName("B");
		roster.add(p);

		p = new Person();
		p.setAge(15);
		p.setName("C");
		roster.add(p);
		
		p = new Person();
		p.setAge(10);
		p.setName("D");
		roster.add(p);

		Approach3 a3 = new Approach3();
		printPersonsLocalClass(
			    roster,a3.new CheckPersonEligibleForSelectiveService());
	}
	
	interface CheckPerson {
	    boolean test(Person p);
	}
	

	//Local class defined as to implement test
	class CheckPersonEligibleForSelectiveService implements CheckPerson {
	    public boolean test(Person p) {
	        return p.gender == Person.Sex.MALE &&
	            p.getAge() >= 18 &&
	            p.getAge() <= 25;
	    }
	}
	
	public static void printPersonsLocalClass(
		    List<Person> roster, CheckPerson tester) {
		    for (Person p : roster) {
		        if (tester.test(p)) {
		            p.printPerson();
		        }
		    }
	}
	

}
