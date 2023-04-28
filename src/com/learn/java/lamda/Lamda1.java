package com.learn.java.lamda;

public class Lamda1 {

	public static void main(String [] args){
		
		IDraw drawable = ()-> {
			System.out.println("Hello draw something");
			};
			drawable.draw();
	}
}
