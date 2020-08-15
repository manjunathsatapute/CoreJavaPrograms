package com.xworkz.interfaceconcept.assignment;

public class Audi implements Car{
	
	@Override
	public void applyAccelerator() {
		System.out.println("Maintain the acceleration within economy zone");
	}
	
	@Override
	public void applyBreak() {
		System.out.println("Apply the breaks during Humps");
	}
	
	@Override
	public void turnSteeringToRight() {
		System.out.println("To turn right steer right");
	}
	
	@Override
	public void turnSteeringToLeft() {
		System.out.println("To turn left steer left"+"\n");
	}

}
