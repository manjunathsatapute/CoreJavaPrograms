package com.xworkz.overriding;

public class Vegetarian extends Food{
	
	String cuisineType;
	
	
	void vegiMethod() {
		System.out.println("Vegi food for vegetarians");
	}
	
	//method overriding
	@Override
	void cooking() {
		System.out.println("Cooking only vegetarian food");
	}

}
