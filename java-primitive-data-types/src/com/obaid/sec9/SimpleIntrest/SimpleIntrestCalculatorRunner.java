package com.obaid.sec9.SimpleIntrest;

import java.math.BigDecimal;

public class SimpleIntrestCalculatorRunner {

	public static void main(String[] args) {
		
		SimpleIntrestCalculator calculator = new SimpleIntrestCalculator("4500.00,", " 7.5");
		
		BigDecimal totalValue = calculator.calculateToltalValue(5);// 5 years
		
		System.out.println(totalValue);

	}

}
