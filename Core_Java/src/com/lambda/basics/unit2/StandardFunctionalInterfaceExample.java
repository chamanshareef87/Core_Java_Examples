package com.lambda.basics.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lambda.basic.uint1.Person;

public class StandardFunctionalInterfaceExample {

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
		printConditionally_v1(people,p->true, p-> System.out.println(p));

		System.out.println("Print all persons with last name begins with C");
		//Here we are passing behaviour itself as a argument
		printConditionally_v1(people,p->p.getLastName().startsWith("C"), p-> System.out.println(p));

		System.out.println("Print all persons with First name begins with C");
		//Here we are passing behaviour itself as a argument
		printConditionally_v1(people,p->p.getFirstName().startsWith("C"), p-> System.out.println(p));

		printConditionally_v1(people,p->p.getFirstName().startsWith("C"), p-> System.out.println(p.getFirstName()));

	}

	//using out of the box interface predicate
	private static void printConditionally_v1(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people){
			if(predicate.test(p)){
				consumer.accept(p);
			}
		}
	}

}
