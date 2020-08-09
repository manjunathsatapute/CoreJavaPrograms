package com.xworkz.abstractclass;

public class CanaraBank extends RBIBank {

	@Override
	void openBankAccount() {
		System.out.println("Things Required are: ");
		System.out.println("Aadhaar card"+"\n"+"Pan card"+"\n"+"Photos");
	}
}
