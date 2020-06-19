package com.obaid.oops;

public class BookRunner {

	public static void main(String[] args) {
		
		Book artOfCoputerProgramming = new Book(5);
		Book effectiveJava = new Book(6);
		Book cleanCode= new Book(7);
		
		System.out.println(artOfCoputerProgramming.getNoOfCopies());
		
		System.out.println(effectiveJava.getNoOfCopies());

		System.out.println(cleanCode.getNoOfCopies());
		
		
		artOfCoputerProgramming.start();
		effectiveJava.start();
		cleanCode.start();
		
		artOfCoputerProgramming.setNoOfCopies(500);
		
		effectiveJava.setNoOfCopies(800);
		
		cleanCode.setNoOfCopies(1000);
		
		
		artOfCoputerProgramming.increaseNoOfCopies(1500);
		
		effectiveJava.increaseNoOfCopies(1200);
		
		cleanCode.increaseNoOfCopies(1000);
		
		
		
		
	

		System.out.println(artOfCoputerProgramming.getNoOfCopies());
		
		
		
		System.out.println(	effectiveJava.getNoOfCopies());
		
		
		
		
		System.out.println(cleanCode.getNoOfCopies());
		
		
		// TODO Auto-generated method stub

	}

}

