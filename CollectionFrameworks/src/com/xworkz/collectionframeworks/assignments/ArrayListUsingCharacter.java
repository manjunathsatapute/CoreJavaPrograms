package com.xworkz.collectionframeworks.assignments;

import java.util.ArrayList;

public class ArrayListUsingCharacter {

	public static void main(String[] args) {

		ArrayList<Character> alc = new ArrayList<Character>();

		alc.add('A');
		alc.add('M');
		alc.add('B');
		alc.add('Z');
		alc.add('1');
		alc.add('9');
		alc.add('7');

		System.out.println("Arraylist using Character: " + alc + "\n");
		System.out.println("Is the araaylist has elements: " + alc.isEmpty() + "\n");
		System.out.println("Traversing using for-loop:");
		for (int i = 0; i < alc.size(); i++) {
			System.out.println(alc.get(i));
		}
		System.out.println();
		System.out.println("Using Enhanced for-each loop:");
		for (Character c : alc) {
			System.out.println(c);
		}
		System.out.println("\n" + "Updating 1st element: " + alc.set(0, 'Z') + " with 'Z'" + "\n");
		System.out.println("Displaying 5th element: " + alc.get(4) + "\n");
		System.out.println("Removed 3rd element: " + alc.remove(2) + "\n" + "New arraylist: " + alc + "\n");
		System.out.println("Check if the arraylist has 'Z' element: " + alc.contains('Z') + "\n");
		System.out.println("Remove element: " + alc.remove(0) + "\n" + "New arraylist: " + alc + "\n");

	}

}
