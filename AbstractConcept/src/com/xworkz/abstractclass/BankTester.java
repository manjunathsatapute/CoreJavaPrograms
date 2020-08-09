package com.xworkz.abstractclass;

public class BankTester {

	public static void main(String[] args) {

		System.out.println("SBI Bank: ");
		RBIBank bank = new SBIBank();	//Upcasting
		bank.openBankAccount();
		bank.deposit(10000);
		bank.withdraw(5000);
		System.out.println();
		
		System.out.println("Canara Bank: ");
		RBIBank bank1 = new CanaraBank();	//Upcasting
		bank1.openBankAccount();
		bank1.deposit(8000);
		bank1.withdraw(4000);

		// RBIBank bank = new RBIBank();	//parent class
		// cannot create instance of parent class having abstract methods and class

	}

}
