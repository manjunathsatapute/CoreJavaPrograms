package com.xworkz.interface_extends_implementspattern;

public interface AndromedaGalaxy extends MilkyWayGalaxy {

	String nameOfGalaxy = "Andromeda Galaxy";
	
	//interface can have only abstract methods apart from that 
	//it can also have default and static methods with implementation
	
	default void selfRotation() {	//written to check default method
		System.out.println("Rotate on its own axis");
	}
	
	default void toCollision() {	//written to check default method
		System.out.println("Galaxies collide and merge to form new Galaxy");
	}
	
	void motion();
	
}
