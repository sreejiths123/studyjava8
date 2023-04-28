package com.learn.java.functionalInterface;

import java.util.function.Function;

public class PredefinedFunction {

	public static void main(String...args){
		
		Function<String, String> concatenate = (message ) ->{
			return "Hello " + " " + message;
		};
		Function<String,String> concatenatemore = (message1) ->{
			return " How are you ?" + message1;
		};
		//concatenatemore.apply(" today");
		
		//concatenate.apply(" Sreejith ");
		System.out.println(concatenatemore.compose(concatenate).apply("bye"));
		
	}
	
}
