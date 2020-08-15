package com.xworkz.overriding.assignment;

public class Child extends Parent{
	
	String gender = "Male";
	int age = 25;
	
	void toLearnGoodHabbits() {
		System.out.println("The childerns should follow the good habbits");
	}
	
	@Override
	void toEducate() {
		System.out.println("To get good education");
	}
	
	@Override
	void toProtect() {
		System.out.println("They should be protective against bad things");
	}
	
}
