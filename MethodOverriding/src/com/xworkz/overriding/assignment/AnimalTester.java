package com.xworkz.overriding.assignment;

public class AnimalTester {

	public static void main(String[] args) {

		System.out.println("Main Method Started" + "\n");

		Animal cow = new HerbivoreAnimals();
		cow.animalName = "Cow";
		cow.color = "white";
		cow.sound = "Mooo";
		cow.isItDangerous = false;
		System.out.println("Animal Name: " + cow.animalName + "\n" + "Sound: " + cow.sound + "\n" + "Color: "
				+ cow.color + "\n" + "isItDangerous: " + cow.isItDangerous + "\n");
		cow.habitat();
		cow.inSearchOfFood();

		Animal lion = new CarnivoreAnimals();
		lion.animalName = "Lion";
		lion.color = "Reddish-brown";
		lion.sound = "Roaring";
		lion.isItDangerous = true;
		System.out.println("Animal Name: " + lion.animalName + "\n" + "Sound: " + lion.sound + "\n" + "Color: "
				+ lion.color + "\n" + "isItDangerous: " + lion.isItDangerous + "\n");
		lion.habitat();
		lion.inSearchOfFood();

		System.out.println("Main Method Ended");
	}

}
