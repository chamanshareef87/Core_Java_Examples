package com.classes.nestedclasses.lambdaExp;

import java.util.ArrayList;
import java.util.List;

public class Approach2 {

	public static void main(String[] args) {

		List<Person> roster = new ArrayList<Person>();
		Person p = new Person();
		p.setAge(20);
		p.setName("A");
		roster.add(p);
		
		p = new Person();
		p.setAge(30);
		p.setName("B");
		roster.add(p);

		p = new Person();
		p.setAge(40);
		p.setName("C");
		roster.add(p);
		
		p = new Person();
		p.setAge(50);
		p.setName("D");
		roster.add(p);
		
		printPersonsWithinAgeRange(roster, 35, 45);
		
	}
	
	//Create More Generalized Search Methods
	public static void printPersonsWithinAgeRange(
		    List<Person> roster, int low, int high) {
		    for (Person p : roster) {
		        if (low <= p.getAge() && p.getAge() < high) {
		            p.printPerson();
		        }
		    }
	}

}
