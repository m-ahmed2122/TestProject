package com.Section17.Functional.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesRunner { //shortcut
 
	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Apple", "Banana", "Cat", "Dog", "Elephant");
	
		list.stream().map(s -> s.length()).forEach(s -> MethodReferencesRunner.print(s));
		
		list.stream().map(String::length).forEach(MethodReferencesRunner::print);//syso is different
	
	
	}

}
