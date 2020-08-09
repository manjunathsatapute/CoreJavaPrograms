package com.xworkz.abstractclass;

public class SBIBank extends RBIBank {

	@Override
	void openBankAccount() {
		System.out.println("Things required are: ");
		System.out.println("Aadhaar card"+"\n"+"Voter ID"+"\n"+"Photos");
	}
}
