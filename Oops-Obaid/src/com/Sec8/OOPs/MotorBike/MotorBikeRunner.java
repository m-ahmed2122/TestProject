package com.Sec8.OOPs.MotorBike;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike ducati= new MotorBike(100);
		MotorBike honda= new MotorBike(200);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
		ducati.start();
		honda.start();
		
		
		ducati.setSpeed(100);
		honda.setSpeed(200);
		
		
		ducati.increaseSpeed(100);
		
		honda.increaseSpeed(100);
			
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	
		
		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);
	
	System.out.println(ducati.getSpeed());
	
	System.out.println(honda.getSpeed());
	}
	
	

}
