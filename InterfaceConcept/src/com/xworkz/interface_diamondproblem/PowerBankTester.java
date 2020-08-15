package com.xworkz.interface_diamondproblem;

public class PowerBankTester {

	public static void main(String[] args) {

		System.out.println("Main Method Started"+"\n");
		
		MicromaxPowerBank micromax = new PowerBank();
		System.out.println("Barnd name of Powerbank: "+MicromaxPowerBank.brandName+"\n"+"Capacity: "+MicromaxPowerBank.capacity);
		micromax.toCharge();
		micromax.portable();
		
		System.out.println();
		
		SamsungPowerBank samsung = new PowerBank();
		System.out.println("Barnd name of Powerbank: "+SamsungPowerBank.brandName+"\n"+"Capacity: "+SamsungPowerBank.capacity);
		samsung.toCharge();
		samsung.portable();
		
		System.out.println("\n"+"Main Method Ended");
	}

}
