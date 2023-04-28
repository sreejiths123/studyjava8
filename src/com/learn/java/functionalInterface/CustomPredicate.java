package com.learn.java.functionalInterface;

import java.util.function.Predicate;

@FunctionalInterface
public interface CustomPredicate<T> {

	public abstract boolean test(T t);
	
	public default Predicate<T> and(Predicate<? super T> other , int age){
		
		return (t)-> test(t) && other.test(t);
	}
}
