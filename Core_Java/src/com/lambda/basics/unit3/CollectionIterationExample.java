package com.lambda.basics.unit3;

import java.util.Arrays;
import java.util.List;

import com.lambda.basic.uint1.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charle", "Dicken", 60),
				new Person("Lewis", "Carroll", 25),
				new Person("Thomas", "Carlyle", 25),
				new Person("Charlotte", "Bronte", 25),
				new Person("Matthew", "Arnold", 25)
				);
		
		System.out.println("Using for loop");
		for(int i=0; i<people.size();i++){
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in loop");
		for(Person p: people){
			System.out.println(p);
		}

		System.out.println("Using lambda foreach loop");
		people.forEach(p->System.out.println(p));

		System.out.println("Using lambda foreach loop(Method reference)");
		people.forEach(System.out::println);

	}

}
