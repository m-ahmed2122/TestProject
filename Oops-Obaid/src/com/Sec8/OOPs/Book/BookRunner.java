package com.Sec8.OOPs.Book;

public class BookRunner {

	public static void main(String[] args) {
		
		Book artOfCoputerProgramming = new Book(10);
		Book effectiveJava = new Book(20);
		Book cleanCode= new Book(50);
		
		System.out.println(artOfCoputerProgramming.getNoOfCopies());
		
		System.out.println(effectiveJava.getNoOfCopies());

		System.out.println(cleanCode.getNoOfCopies());
		
		
		artOfCoputerProgramming.start();
		effectiveJava.start();
		cleanCode.start();
		
		artOfCoputerProgramming.setNoOfCopies(500);
		
		effectiveJava.setNoOfCopies(500);
		
		cleanCode.setNoOfCopies(500);
		
		
		artOfCoputerProgramming.increaseNoOfCopies(1500);
		
		effectiveJava.increaseNoOfCopies(1200);
		
		cleanCode.increaseNoOfCopies(1000);
			

		System.out.println(artOfCoputerProgramming.getNoOfCopies());
		
		System.out.println(	effectiveJava.getNoOfCopies());
		
		System.out.println(cleanCode.getNoOfCopies());
		
		
		

	}

}

