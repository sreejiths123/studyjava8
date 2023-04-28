package com.learn.java.lamda;

public class LamdaReturn {

	public static void main(String args []){
		
		IDrawReturn drawable =()->{
			return "beutiful painting";
		};
		
		System.out.println(drawable.draw());
		
		IDraw drawprint = ()-> System.out.println("Hello this is single line lamba");
		drawprint.draw();
		
		// Avereage with array as argements
		
		IAverage average = (arrayOfNumbers)->{
			
			int sum = 0;
			for(int i=0;i<arrayOfNumbers.length;i++){
				sum += arrayOfNumbers[i];
			}
			return sum/arrayOfNumbers.length;
		};
		int [] arr = {3,4,24,43};
		System.out.println(average.avg(arr));
	}
}