package com.learn.java.functionalInterface;

import java.util.function.Predicate;

import com.learn.java.objects.Person;

public class PredefinedPredicate {

	public static void main(String args []){
		
		Predicate<Person> p = (person)-> person.getAge() > 20;
		
		p = p.and((person)->person.getName().equals("Sreejith"));
		
		boolean result = p.test(new Person("Sreejith", 23));
		
		System.out.println("Test employee greater than 23 "+result);
		
		
	}
}
