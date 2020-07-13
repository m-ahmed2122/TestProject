package com.Obaid.Section13;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		int [] marks = { 95,98,100}; 
		
		Student student = new Student ();
		
		student.setName("Obaid");
		
		student.setMarks(marks);
		
		System.out.println(student);
		
		int number = student.getNumberOfMarks();
		
		System.out.println("number of marks : " + number);
		
		int sum = student.getTotalSumOfMarks();
		
		System.out.println( "Total Sum Of Marks : " + sum);

		int maximumMark = student.getMaximumMark();
		
		System.out.println("Maximum mark : " + maximumMark);
		
		int minimumMark = student.getMinimumMark();
		
		System.out.println("Minimum mark : " + minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("average : " + average);
		
	}

}
