package com.xworkz.interfaceconcept.assignment;

public class CarTester {

	public static void main(String[] args) {

		System.out.println("Main Method Started"+"\n");
		
		Car bmw = new BMW();	//instance of BMW using Car reference; Upcasting
//		bmw.brand = "BMW";
		bmw.applyAccelerator();
		bmw.applyBreak();
		bmw.turnSteeringToRight();
		bmw.turnSteeringToLeft();
		
		Car audi = new Audi();	//instance of Audi using Car reference; Upcasting
//		audi.brand = "Audi";
		audi.applyAccelerator();
		audi.applyBreak();
		audi.turnSteeringToRight();
		audi.turnSteeringToLeft();
		
		System.out.println("Main Method Ended");
	}

}
