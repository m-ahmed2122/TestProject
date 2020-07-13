package com.Obaid.Section13.String;

public class StringRunner {

	public static void main(String[] args) {
		
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday"};
		
		String dayWithMostCharacters = "";
		for(String day:daysOfWeek) {
			if(day.length() > dayWithMostCharacters.length()) {
				
				dayWithMostCharacters = day;
			}}
				//printed string reverse
				for (int i=daysOfWeek.length-1; i>=0; i--) {
					System.out.println(daysOfWeek[i]);
				}
				
			
		
System.out.println("Day With Most number of characters " + dayWithMostCharacters);
	}

}
