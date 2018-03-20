package com.lambda.basics.unit3;

import java.util.Arrays;
import java.util.List;

import com.lambda.basic.uint1.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charle", "Dicken", 60),
				new Person("Lewis", "Carroll", 25),
				new Person("Thomas", "Carlyle", 25),
				new Person("Charlotte", "Bronte", 25),
				new Person("Matthew", "Arnold", 25)
				);

		System.out.println("Iterating and printing all elements");
		people.stream()
		.forEach(p->System.out.println(p));
		
		System.out.println("");
		System.out.println("Iterating and filtering in a single loop all elements");
		people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.forEach(p->System.out.println(p));
		
		System.out.println("");
		System.out.println("Iterating and filtering in a single loop all elements");
		people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.filter(p->p.getFirstName().startsWith("T"))
		.forEach(p->System.out.println(p));

		
		long count = people.stream()
		.filter(p->p.getFirstName().startsWith("T"))
		.count();

		System.out.println(count);
		
		//this uses multi process
		long count1 = people.parallelStream()
		.filter(p->p.getFirstName().startsWith("T"))
		.count();

		System.out.println(count1);

	}
}
