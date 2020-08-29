package com.xworkz.collectionframeworks.assignments;

import java.util.ArrayList;

public class BikeObjectUsingCollection {

	public static void main(String[] args) {

		ArrayList<Bike> al = new ArrayList<Bike>();

		Bike b1 = new Bike();
		Bike b2 = new Bike(100000, "CB Hornet", 160, 60, true);

		al.add(b1);
		al.add(b2);
		System.out.println(al);

//		System.out.println(b1);
//		System.out.println(b2);

		/*
		 * for(int i=0; i<al.size(); i++) { 
		 * System.out.println(al.get(i)); 
		 * }
		 */

		for (Bike bk : al) {
//		System.out.println(bk);
		System.out.println("Name: " + bk.brandName + " cc: " + bk.cc + " Mileage: " + bk.mileage + " Price: "
					+ bk.price + " isItFourStroke: " + bk.isItFourStroke);
		}
		
		b1.start();
		b2.stop();
		b1.applyBrakes();
	}
}
