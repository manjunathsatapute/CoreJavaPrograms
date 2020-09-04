package com.xworkz.exceptionhandling.classproblems;

public class RunTimeExceptionExample {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		arrayManipulation();
		System.out.println("Main Method Ended");
	}

	static void arrayManipulation() {

		try {
			try {
				int num = Integer.parseInt("abc");
				System.out.println(num);
			} catch (NumberFormatException e) {
				System.out.println("String cannot be converted to integer");
			}
			int[] intArray = { 1, 2, 3, 4, 5 };
			System.out.println("The fifth element is: " + intArray[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered index does not exist");
		} catch (RuntimeException e) {
			System.out.println("Exception occured");
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}
}
