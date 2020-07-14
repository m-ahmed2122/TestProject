package com.Section17.FP.Collect;

import java.util.Arrays;
import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(4, 6, 8, 13, 3, 15);

		numbers.stream().forEach(element->System.out.println(element));
		
		int sum = fpSum(numbers);

		System.out.println(sum);
	}
	//In FP we avoid mutations of variables, we focus abt what to do rather than how to do  

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;//mutations---value changes(incrementing)

		}
		return sum;
	}

}