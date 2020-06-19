package com.obaid.oops;

public class BMWRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		
	}

}
