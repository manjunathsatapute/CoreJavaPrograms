package com.xworkz.interface_implements_extendspattern;

public class SpectaclesTester {

	public static void main(String[] args) {

		System.out.println("Main Method Started"+"\n");
		
//		instance of lenskart is created using parent class ref; 
//	    here we can get all states of parent and overridden methods from child(lenskart) class 
		
		Spectacles spects = new LenskartSpects();	
		System.out.println("Material Used: "+LenskartSpects.materialMadeOf);
		spects.toRead();
		spects.toView();
		
		System.out.println();
		
		FastrackSpects fasttrack = new LenskartSpects();
		System.out.println("Name of brand: "+fasttrack.brandName);
		fasttrack.toRead();
		fasttrack.toView();
		fasttrack.toGetClearVision();
		
		System.out.println("\n"+"Main Method Ended");
	}

}
