package com.xworkz.overriding.assignment;

public class GrandSon extends Child {
	
	String gender = "Male";
	int age = 10;
	
	@Override
	void toEducate() {
		System.out.println("To get good education");
	}
	
	void toBeDisciplined() {
		System.out.println("They should behave in a disciplined manner");
	}
	
	@Override
	void toLearnGoodHabbits() {
		System.out.println("The childerns should follow the good habbits"+"\n");
	}
	
}
