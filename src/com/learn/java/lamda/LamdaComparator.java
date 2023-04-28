package com.learn.java.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaComparator {

	public static void main(String [] args){
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Sreejith", 23));
		persons.add(new Person("Rajesh", 40));
		persons.add(new Person("Umesh",33));
		
		Comparator<Person> personComparator = new Comparator<Person>() {
			
			@Override
			public int compare(Person o1 , Person o2){
				
				return o1.getAge() - o2.getAge();
			}
		};
		
		
		Collections.sort(persons,personComparator);
		
		System.out.println(" sort persons by age in ascending order");
        for (Person person : persons) {
            System.out.println(" Person name : " + person.getName());
        }
        
        // sorting and comparing using Lamda 
        
        Comparator<Person> lamdaComparator = (Person o1 , Person o2) -> {
        	
        	return o1.getAge() - o2.getAge();
        };
        
        Collections.sort(persons,(Person o1 , Person o2) -> {
        	
        	return o1.getAge() - o2.getAge();
        });
	}
}

class Person {
	
	private String name;
	private int age;
	
	Person(String name,int age){
		this.age =age;
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){return this.age ; }
	
	public void setAge(int age){
		this.age = age;
	}
}
