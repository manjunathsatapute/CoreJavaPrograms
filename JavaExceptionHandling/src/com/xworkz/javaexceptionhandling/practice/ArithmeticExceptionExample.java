package com.xworkz.javaexceptionhandling.practice;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		System.out.println("MMS");
		try {
			double a = 100/0;
			System.out.println(a);
		} 
		catch(ArithmeticException e){
			System.out.println(e+" not possible");
		}
		finally {
			System.out.println("running");
		}
		System.out.println("MME");
	}

}
