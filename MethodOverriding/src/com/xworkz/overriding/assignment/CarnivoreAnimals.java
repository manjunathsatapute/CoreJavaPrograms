package com.xworkz.overriding.assignment;

public class CarnivoreAnimals extends Animal {
	
	String animalName;
	String sound;
	String color;
	boolean isItDangerous;
	
	void habitat() {
		System.out.println("Most of Carnivore animals are wild in nature and stays in forest");
	}
	
	void inSearchOfFood() {
		System.out.println("Carnivore Animals are non-vegetarian and get the food by hunting"+"\n");
	}
	
}
