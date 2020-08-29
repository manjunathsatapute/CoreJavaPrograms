package com.xworkz.lambdaexpression.assignment;

public class NoArgumentFunctionalInterfaceImpl {

	public static void main(String[] args) {

		NoArgumentFunctionalInterface noarg = () -> 
		System.out.println("Hello World");
		System.out.println("Hi Manju");
		
		noarg.printHello();
	}

}
