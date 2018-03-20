package com.lambda.basic.uint1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.lambda.basic.uint1.Unit1ExerciseSolutionJava7.Condition;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charle", "Dicken", 60),
				new Person("Lewis", "Carroll", 25),
				new Person("Thomas", "Carlyle", 25),
				new Person("Charlotte", "Bronte", 25),
				new Person("Matthew", "Arnold", 25)
				);

		//Solr list by last name
		Collections.sort(people, (p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		//Create method that prints all elements in the list
		System.out.println("Print all persons");
		printAll(people);
		
		System.out.println("Print all persons with last name begins with C");
		//Here we are passing behaviour itself as a argument
		printConditionally(people,p->p.getLastName().startsWith("C"));

		System.out.println("Print all persons with First name begins with C");
		//Here we are passing behaviour itself as a argument
		printConditionally(people,p->p.getFirstName().startsWith("C"));

		System.out.println("Print all persons with last name begins with C");
		//Here we are passing behaviour itself as a argument
		printConditionally_v1(people,p->p.getLastName().startsWith("C"));

		System.out.println("Print all persons with First name begins with C");
		//Here we are passing behaviour itself as a argument
		printConditionally_v1(people,p->p.getFirstName().startsWith("C"));

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
	}

	
	//using out of the box interface predicate
	private static void printConditionally_v1(List<Person> people, Predicate<Person> predicate) {
		for(Person p : people){
			if(predicate.test(p)){
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p : people){
			System.out.println(p);
		}
	}

}
