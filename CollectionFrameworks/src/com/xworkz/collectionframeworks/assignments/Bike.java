package com.xworkz.collectionframeworks.assignments;

public class Bike {

	int price;
	String brandName;
	double cc;
	int mileage;
	boolean isItFourStroke;
	
	Bike(){
		System.out.println("Default Constructor");
	}
	
	Bike(int price,	String brandName, double cc, int mileage, boolean isItFourStroke){
		this.brandName = brandName;
		this.cc = cc;
		this.mileage = mileage;
		this.price = price;
		this.isItFourStroke = isItFourStroke;
		System.out.println("Name: "+brandName+" cc: "+cc+" Mileage: "+mileage+" Price: "+price+" isItFourStroke: "+isItFourStroke);
	}
	
	void start() {
		System.out.println("Bike started");
	}
	
	String applyBrakes() {
		System.out.println("Brakes applied");
		return "Brakes applied";
	}
	
	void stop() {
		System.out.println("Bike stopped");
	}

	@Override
	public String toString() {
		return "Bike [price=" + price + ", brandName=" + brandName + ", cc=" + cc + ", mileage=" + mileage
				+ ", isItFourStroke=" + isItFourStroke + "]";
	}
	
	
}
