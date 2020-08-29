package com.xworkz.collectionframeworks;

import java.util.ArrayList;

public class CollectionExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(true);
		al.add("Manju");
		al.add(10.00);
		al.add('A');
		al.add(null); // it contains nothing:empty
		al.add(10);		//duplicates are allowed
		Job j = new Job();
		j.companyName = "Infosys";
		j.salary = 20000;
		al.add(j);	//object created and added

//if arraylist is not of fixed type like string, int, double etc then we can take datatype as a class 'Object'.
		for(Object obj : al) {		
			System.out.println("---"+obj+"---");
		}
		System.out.println("ArrayList collection: " + al + "\n");
		System.out.println("Using different Methods of object class for collection:" + "\n");
		System.out.println("toString() gives normally Fully qualified class name but here it's overridden to arraylist: "+"\n" + al.toString() + "\n");
		System.out.println("Clone() creates Duplicate collection of arraylist: " + al.clone() + "\n");
		System.out.println("hashcode() just gives Number: " + al.hashCode() + "\n");
		System.out.println("indexOf() gives the index value of the first occurence of specified element: " + al.indexOf("Manju") + "\n");
		System.out.println("size() gives the total length of arraylist collection: " + al.size() + "\n");
		System.out.println("contains() It will check for the object present or not and returns Boolean: "
				+ "true/false: " + al.contains('A') + "\n");
		System.out.println("get() is used to get the values of arraylist collection using the index number: "
				+ al.get(2) + "\n");
		System.out.println("isEmpty() will work only if arraylist collection is completely empty and "
				+ "returns Boolean: " + al.isEmpty() + "\n");
		System.out.println(al.get(3));
		System.out.println(al.size());
		al.set(3, "Manjuanth");		//it will replace the elements with given index number maintaining the same length.
		System.out.println(al);
		System.out.println(al.size());
		System.out.println("" + al.iterator());
		System.out.println("" + al.listIterator() + "\n");
		
		System.out.println("ArrayList collection: " + al);
		System.out.println("remove() it will remove the element based on the particular index/elements: " + al.remove(null));
		System.out.println("ArrayList collection: " + al + "\n");
		System.out.println("lastIndexOf() gives the index value of the last occurence of specified elements and for non objects gives -1:" + " "
				+ al.lastIndexOf(true) + "\n");
		al.add(3, "Manju"); // it will add new/same element to the particular index by shifting the elements
		System.out.println("ArrayList collection: " + al + "\n");
		al.clear(); //it will clear all the objects within the array and gives: []
		System.out.println("ArrayList collection: " + al + "\n");
		
	}

}
