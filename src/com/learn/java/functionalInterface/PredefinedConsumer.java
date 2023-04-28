package com.learn.java.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.learn.java.objects.Person;

public class PredefinedConsumer {

	public static void main(String args []){
		
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("Sreejith", 39));
		personList.add(new Person("Sanju", 30));
		personList.add(new Person("Ramesh", 45));
		personList.add(new Person("Pravellika", 24));
		personList.add(new Person("Chandran", 66));
		
		Consumer<Person> personConsumer = (person)->{
			
			System.out.println(person.getName());
		};
		Consumer<List<Person>> consumer =(persons)->{
			persons.forEach((person) ->personConsumer.accept(person));
		};

		consumer.accept(personList);
	}
}
