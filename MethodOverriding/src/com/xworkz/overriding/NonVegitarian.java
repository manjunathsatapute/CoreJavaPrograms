package com.xworkz.overriding;

public class NonVegitarian extends Food {

	String cuisineType;
	int quantityIngms;
	
		@Override
		void cooking() {
			System.out.println("cooking only nonveg food");
		}

}
