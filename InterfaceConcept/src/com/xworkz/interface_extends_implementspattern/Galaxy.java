package com.xworkz.interface_extends_implementspattern;

public class Galaxy implements AndromedaGalaxy {

	@Override
	public void rotation() {
		System.out.println("Galaxies rotate on its own axis");
	}
	
	@Override
	public void collision() {
		System.out.println("New galaxies will be created from collision of 2 or more galaxy");
	}
	
	@Override
	public void motion() {
		System.out.println("All galaxies are in a continuous motion");
	}
	
	@Override
	public void selfRotation() {
		System.out.println("Rotate on its own axis");
	}
	
	@Override
	public void toCollision() {
		System.out.println("Galaxies collide and merge to form new Galaxy");
	}
}
