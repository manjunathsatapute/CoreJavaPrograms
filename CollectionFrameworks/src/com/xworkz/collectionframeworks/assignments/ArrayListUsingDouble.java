package com.xworkz.collectionframeworks.assignments;

import java.util.ArrayList;

public class ArrayListUsingDouble {

	public static void main(String[] args) {

		ArrayList<Double> ald = new ArrayList<Double>(); // wrapper class: Double

		ald.add(1.5);
		ald.add(10.7);
		ald.add(5.0);
		ald.add(55.55);
		ald.add(33.333333);
		ald.add(99.999999999999999); // round off to 100.0 after 15 digits of decimal places

		System.out.println("\n"+"Arraylist using Double: " + ald + "\n");
		System.out.println("Size of Arraylist: " + ald.size() + "\n");
		System.out.println("Using for loop:");
		for (int i = 0; i < ald.size(); i++) {
			System.out.println(ald.get(i));
		}
		System.out.println();
		System.out.println("Using Enhanced for loop:");
		for (Double d : ald) {
			System.out.println(d);
		}
		System.out.println("\n" + "Updating 3rd element 5.0 with 56.23: " + ald.set(2, 56.23) + "\n");
		System.out.println(ald + "\n");
		System.out.println("Displaying the last element: " + ald.get(5) + "\n");
		System.out.println("Removed first element: " + ald.remove(0) + "\n");
		System.out.println("Displaying new Arraylist: " + ald + "\n");
		System.out.println("Removed: " + ald.remove(1) + "\n");
		System.out.println("Displaying new Arraylist: " + ald + "\n");

	}
}
