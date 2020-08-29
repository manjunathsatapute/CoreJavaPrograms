package com.xworkz.collectionframeworks.assignments;

import java.util.ArrayList;

public class ArrayListUsingInteger {

	public static void main(String[] args) {

		ArrayList<Integer> ali = new ArrayList<Integer>();
		
		ali.add(60);
		ali.add(20);
		ali.add(30);
		ali.add(40);
		ali.add(50);
		ali.add(60);
		
		System.out.println(ali+"\n");
		
		for(int i=0; i<ali.size(); i++) {
			System.out.println(ali.get(i));
		}
		
		System.out.println();
		
		for(Integer num : ali) {
			System.out.println(num);
		}
		System.out.println();
		System.out.println("Size of arraylist: "+ali.size()+"\n");
		System.out.println("Is Arraylist empty: "+ali.isEmpty()+"\n");
		System.out.println("It contains element 40? "+ali.contains(40)+"\n");
		System.out.println("FQCN is overriden: "+ali.toString()+"\n");
		System.out.println("Cloned Arraylist: "+ali.clone()+"\n");
		System.out.println("Fetching element at index 2: "+ali.get(2)+"\n");
		System.out.println("What is the index of element 60: "+ali.indexOf(60)+"\n");
		System.out.println("Using the last index of  for element 10: "+ali.lastIndexOf(60)+"\n");
		System.out.println(ali+"\n");
		System.out.println("Size after removing the element at index 3: "+ali.size()+"\n");
		System.out.println(ali+"\n");
		System.out.println("Added new element 10 in place of element present in index 3: "+ali.set(3, 10)+"\n");
		System.out.println(ali+"\n");
		System.out.println("If adding new element is possible it returns true: "+ali.add(70)+"\n");
		System.out.println("new arraylist: "+ali+"\n");
		System.out.println("New size: "+ali.size()+"\n");
		System.out.println("Remove the element at index 3: "+ali.remove(3)+"\n");
		System.out.println("Remove using new Integer keyword: "+"\n"+"Here directly we can give the element to be removed "
				+ "and returns boolean: "+ali.remove(new Integer(3))+"\n");
		System.out.println("Removed element 20 using new Integer keyword: "+ali.remove(new Integer(20))+"\n");
		System.out.println(ali+"\n");
		
		System.out.println("Using for each loop: ");
		for(Integer num : ali) {
			System.out.println(num);
		}
		
	}

}
