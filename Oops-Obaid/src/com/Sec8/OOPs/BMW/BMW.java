package com.Sec8.OOPs.BMW;

public class BMW {
	
	private int speed;
	
	private int rpm;
	

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	int getRpm() {
		return rpm;
	}

	void setRpm(int rpm) {
		this.rpm = rpm;
	}


	void start() {
		
		System.out.println("Car Running");

		System.out.println("At Lightening Speed");
	
	
	}
	
}
