package com.xworkz.interfaceconcept.assignment;

public class BMW implements Car{
	
	@Override
	public void applyAccelerator() {
		System.out.println("Maintain the required acceleration");
	}
	
	@Override
	public void applyBreak() {
		System.out.println("Apply the breaks now and then");
	}
	
	@Override
	public void turnSteeringToRight() {
		System.out.println("Take the diversion to right");
	}
	
	@Override
	public void turnSteeringToLeft() {
		System.out.println("Take the diversion to left"+"\n");
	}

}
