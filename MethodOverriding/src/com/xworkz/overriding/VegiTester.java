package com.xworkz.overriding;

public class VegiTester {

	public static void main(String[] args) {
		
		Vegetarian vegi = new Vegetarian();
		
		vegi.cuisineType ="Indian";
		vegi.quantityIngms = 200;
		
		System.out.println("Cuisine type: "+vegi.cuisineType+"\n"+" Quantity "+vegi.quantityIngms);
		
		vegi.cooking();
		vegi.vegiMethod();
	}
}
