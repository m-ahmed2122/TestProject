package com.obaid.oops;

public class Book {
	
	private int noOfCopies;
	
	Book(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
	
	
	
	
	public int getNoOfCopies() {
		return noOfCopies;
	}




	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public void increaseNoOfCopies(int howMuch) {
		this.noOfCopies = this.noOfCopies + howMuch;
		
	}
	




	void start() {
		System.out.println("Started Reading");
		System.out.println("Completed Reading");

}
}