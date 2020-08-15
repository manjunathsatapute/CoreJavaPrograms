package com.xworkz.interface_extends_implementspattern;

public class GalaxiesTester {

	public static void main(String[] args) {

		System.out.println("Main Method Started"+"\n");
		
		MilkyWayGalaxy milky = new Galaxy();	//instance of galaxy created; 
		//here we can access only overridden methods of parent class and parent class states
		
		System.out.println("Name of Galaxy: "+MilkyWayGalaxy.galaxyName);
		milky.rotation();
		milky.collision();
		
		System.out.println();
		
		AndromedaGalaxy andro = new Galaxy();	//instance of galaxy created;
		System.out.println("Name of Galaxy: "+AndromedaGalaxy.nameOfGalaxy);
		andro.motion();
		andro.rotation();
		andro.collision();
		andro.toCollision();
		andro.selfRotation();
		
		System.out.println("\n"+"Main Method Ended");
	}

}
