package com.classes.nestedclasses.lambdaExp;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {

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
		
		printPersonsOlderThan(roster, 35);
		
	}
	
	//Create Methods That Search for Members That Match One Characteristic
	public static void printPersonsOlderThan(List<Person> roster, int age) {
	    for (Person p : roster) {
	        if (p.getAge() >= age) {
	            p.printPerson();
	        }
	    }
	}

}
