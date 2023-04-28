package com.learn.java.lamda;

public class LamdaRunnable {

	public static void main (String [] args){
		
		Runnable lamdaRunnable = () -> System.out.println("Inside run statement");
	
		Thread t = new Thread(lamdaRunnable);
		t.start();
	}
}
