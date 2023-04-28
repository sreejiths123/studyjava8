package com.learn.java.lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LamdaIterate {

	public static void main(String...args){
		
        List < String > courses = Arrays.asList("C", "C++", "Core Java", "J2EE", "Spring", "Hibernate", "Python");
        // first method
        courses.stream().forEach(course -> printCourse(course));
        
        courses.stream().forEach(Utils::printCourse);
		
        courses.forEach(Utils::printCourse);
        
        // hashmap
        Map<Integer,String> lamdaMap = new HashMap<Integer,String>();
        lamdaMap.put(1, "Sreejith");
        lamdaMap.put(2, "Sreejit");
        lamdaMap.put(3, "Sreeji");
        lamdaMap.put(4, "Sreej");
        lamdaMap.put(5, "Sree");
        lamdaMap.put(6, "Sre");
        
        lamdaMap.forEach((k,v)-> System.out.println(v));

	}
	
	public static void printCourse(String course){
		System.out.println("Printing course "+course);
	}
}
