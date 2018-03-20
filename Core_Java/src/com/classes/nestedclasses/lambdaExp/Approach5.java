package com.classes.nestedclasses.lambdaExp;

import java.util.ArrayList;
import java.util.List;

public class Approach5 {

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
	
		printPersons(
			    roster,
			    (Person p) -> p.getGender() == Person.Sex.MALE
			        && p.getAge() >= 18
			        && p.getAge() <= 25
		);
		
	}

	private static void printPersons(List<Person> roster, Object object) {
		// TODO Auto-generated method stub
		
	}

	interface CheckPerson {
	    boolean test(Person p);
	}

	
}
