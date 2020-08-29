package com.xworkz.collectionframeworks;

import java.util.ArrayList;

public class ArrayListUsingString {

	public static void main(String[] args) {

		ArrayList<String> flowers = new ArrayList<String>();

		System.out.println("Is Arraylist empty: " + flowers.isEmpty()+"\n");

		flowers.add("Rose");
		flowers.add("Jasmine");
		flowers.add("Champak");
		flowers.add("Lotus");
		flowers.add("Sun flower");

		System.out.println("Flowers Collection: "+flowers+"\n");

		System.out.println("0th index element is: "+flowers.get(0)+"\n"); // flowers[0];
		flowers.set(0, "Marigold"); // flowers[0] = "Marigold";
		// set() will do the function of reassigning the values within the index numbers
		// can't give new index numbers else it will give AIOBE
		// set() will work only if arraylist is of particular type like string, int,
		// double etc and methods of object class will returns the value but does not
		// give output
		// unless it is used with sysout statements

		System.out.println(flowers+"\n");
		System.out.println("Size of Flowers Collection: "+flowers.size()+"\n"); // array.length

		// traverse using for-loop
		for (int i = 0; i <= flowers.size() - 1; i++) { // for(int i=0; i<flowers.size(); i++)
			System.out.println("---" + flowers.get(i) + "---");
		}
		System.out.println();
		// traverse using for-each-loop
		for (String s : flowers) {
			System.out.println("***" + s + "***");
		}

		flowers.add(5, "Rose");
		System.out.println("\n"+flowers);

	}
}
