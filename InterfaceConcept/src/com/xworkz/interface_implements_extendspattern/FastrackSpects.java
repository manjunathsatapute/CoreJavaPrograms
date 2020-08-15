package com.xworkz.interface_implements_extendspattern;

public abstract class FastrackSpects implements Spectacles {

	String brandName = "Fasttrack Spectacles";
	
	@Override
	public void toRead() {
		System.out.println("For better reading");
	}
	
	@Override
	public void toView() {
		System.out.println("To view near and distant objects");
	}
	
	abstract void toGetClearVision();
}
