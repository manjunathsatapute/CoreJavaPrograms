package com.xworkz.interface_implements_extendspattern;

public class LenskartSpects extends FastrackSpects {

	String brandName = "Lenskart Spectacles";
	
	@Override
	void toGetClearVision() {
		System.out.println("For better and clear vision");
	}
}
