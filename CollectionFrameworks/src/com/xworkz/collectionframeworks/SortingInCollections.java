package com.xworkz.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingInCollections {

	public static void main(String[] args) {

		ArrayList<Character> charArrayList = new ArrayList<Character>();
		
		charArrayList.add('A');
		charArrayList.add('E');
		charArrayList.add('D');
		charArrayList.add('C');
		charArrayList.add('B');
		charArrayList.add('F');
		
		System.out.println("The original arraylist is: "+charArrayList);
		
		Collections.sort(charArrayList);
		System.out.println("The Sorted arraylist is: "+charArrayList);
		
		
	}

}
