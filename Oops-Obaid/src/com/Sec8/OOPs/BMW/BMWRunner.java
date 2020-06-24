package com.Sec8.OOPs.BMW;

public class BMWRunner {

	public static void main(String[] args) {
		
		BMW FiveSeries = new BMW();
		BMW SevenSeries= new BMW();
		BMW ThreeSeries= new BMW();
		
		
		FiveSeries.start();
		SevenSeries.start();
		ThreeSeries.start();
		
		
		
		FiveSeries.setSpeed(120);
		
		System.out.println(FiveSeries.getSpeed());
		
		SevenSeries.setSpeed(110);
		
		System.out.println(SevenSeries.getSpeed());
		
		ThreeSeries.setSpeed(100);
		
		System.out.println(ThreeSeries.getSpeed());
		FiveSeries.setRpm(1000);
		System.out.println(FiveSeries.getRpm());
		
		SevenSeries.setRpm(500);
		
		System.out.println(SevenSeries.getRpm());
		
		ThreeSeries.setRpm(100);
		System.out.println(ThreeSeries.getRpm());  
		
		
		
	}

}
