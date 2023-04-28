package com.learn.java.functionalInterface;

import java.util.function.Supplier;

import com.learn.java.objects.Person;

public class PredefinedSupplier {

	public static void main(String [] args){
		
		Supplier<Person> loggedinPerson = ()->{
			
			return new Person("admin", 32432);
		};
		
	  Person userInSession =	loggedinPerson.get();
	  
	  System.out.println(userInSession.getName());
	}
}
