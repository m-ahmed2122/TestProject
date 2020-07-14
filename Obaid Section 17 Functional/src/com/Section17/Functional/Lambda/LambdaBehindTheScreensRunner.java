package com.Section17.Functional.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		
		
		return number%2 ==0;
	}
	
}

public class LambdaBehindTheScreensRunner {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(23,48,43,34,45,36);
		
		numbers.stream()
		.filter
		(n -> n%2 ==0).map(n -> n*n).sorted().forEach(e -> System.out.println(e));
		
		
		numbers.stream()
		.filter
		(new EvenNumberPredicate()).sorted().
		forEach(e -> System.out.println(e));
	}

}
