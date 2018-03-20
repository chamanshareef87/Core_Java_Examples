package com.lambda.basic.uint1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charle", "Dicken", 60),
				new Person("Lewis", "Carroll", 25),
				new Person("Thomas", "Carlyle", 25),
				new Person("Charlotte", "Bronte", 25),
				new Person("Matthew", "Arnold", 25)
				);

		//Solr list by last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		//Create method that prints all elements in the list
		System.out.println("Print all persons");
		printAll(people);
		
		// create method that prints all people that have last name begingin with C
		System.out.println("Print all persons with last name begins with C");
		printLastnameStartswithC(people);

		System.out.println("Print all persons with last name begins with C");
		//Here we are passing behaviour itself as a argument
		printConditionally(people,new Condition(){
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});

		System.out.println("Print all persons with First name begins with C");
		//Here we are passing behaviour itself as a argument
		printConditionally(people,new Condition(){
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});

	}

	private static void printLastnameStartswithC(List<Person> people) {
		for(Person p : people){
			if(p.getLastName().startsWith("C")){
				System.out.println(p);
			}
		}
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p : people){
			System.out.println(p);
		}
	}
		
	interface Condition{
		boolean test(Person p);
	}

}
