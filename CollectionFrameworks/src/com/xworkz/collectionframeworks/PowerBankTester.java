package com.xworkz.collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class PowerBankTester {

	public static void main(String[] args) {

		ArrayList<PowerBank> powerBanksList = new ArrayList<PowerBank>();

		PowerBank pb1 = new PowerBank(10000, 3, "Micromax", 2000);
		powerBanksList.add(pb1);

		PowerBank pb2 = new PowerBank(20000, 4, "Samsung", 3000);
		powerBanksList.add(pb2);

		PowerBank pb3 = new PowerBank(20000, 4, "Samsung", 5000);
		powerBanksList.add(pb3);

		System.out.println(powerBanksList);

//		Collections.sort(powerBanksList);

//		powerBanksList.remove(pb1);	//using object ref variable
//		powerBanksList.remove(1);	//using index

		System.out.println(powerBanksList);

		for (int i = 0; i < powerBanksList.size(); i++) {
			System.out.println("obj" + i + " : " + powerBanksList.get(i));
		}

		for (PowerBank pb : powerBanksList) {
			System.out.println("***" + pb + "***");
		}

		// to print a particular obj using for each loop
		for (PowerBank pb : powerBanksList) {
			if (pb.getBatteryCapacity() == 10000)
				System.out.println("Special pb: " + pb);
		}

		// to assign a new element to particular obj
		for (PowerBank pb : powerBanksList) {
			if (pb.getBatteryCapacity() == 20000) {
				pb.setBrand("MI");
				System.out.println("New brand is: " + pb.getBrand());
			}
		}

		System.out.println(powerBanksList);

		powerBanksList.set(1, new PowerBank(15000, 4, "LG", 6000));
		System.out.println(powerBanksList);

		// try to remove all the object belonging to company MI using for-each loop
		// it gives concurrent Modification exception
		// because its not possible to simultaneously traverse and remove using for-each
		// loop
		// therefore use iterator class
		/*
		 * for (PowerBank pb : powerBanksList) { 
		 * if(pb.getBrand().equals("MI")) {
		 * powerBanksList.remove(pb); } }
		 */
//			System.out.println(powerBanksList);

		Iterator<PowerBank> itr = powerBanksList.iterator();
		// iterator has 3 methods hasNext(), next(), remove()

		while (itr.hasNext()) {
			PowerBank pb = itr.next(); // instead of pb we can use any temporary ref variable here
			System.out.println("The obj is: " + pb);
			if (pb.getBrand().equals("MI")) {
				itr.remove();
			}
		}
		System.out.println("to check : " + powerBanksList);
	}
}