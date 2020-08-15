package com.xworkz.overriding.assignment;

public class HerbivoreAnimals extends Animal {
	
	String animalName;
	String sound;
	String color;
	boolean isItDangerous;
	
	
	@Override
	void habitat() {
		System.out.println("Most of the Herbivore animals are domestic animals stay with humans");
	}
	
	@Override
	void inSearchOfFood() {
		System.out.println("Most of Herbivore animals are vegetarian and feed on grass"+"\n");
	}

}
