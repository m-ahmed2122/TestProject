package com.obaid.sec9.SimpleIntrest;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {
	
	BigDecimal  principal;
	
	BigDecimal interest;
	
	public SimpleIntrestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
		
	}
	public BigDecimal calculateToltalValue(int noOfYears) {
		//Total Value = principal + principal * interest * noOfYears
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply( noOfYearsBigDecimal));
		
		return totalValue;
	}
	
	
	
	
	

}
