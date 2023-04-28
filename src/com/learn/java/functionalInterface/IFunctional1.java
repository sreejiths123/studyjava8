package com.learn.java.functionalInterface;

@FunctionalInterface
public interface IFunctional1 extends IFunctional2 {

	//public void something();
	
	public default void oneDefaultMethod(){
		System.out.println("Default method inside functional interface");
	}
	
	public default void anotherDefault(){
		
	}
	
	public static void aStatic(){
		
		System.out.println("Static method inside Functional Interface");
	}
}
