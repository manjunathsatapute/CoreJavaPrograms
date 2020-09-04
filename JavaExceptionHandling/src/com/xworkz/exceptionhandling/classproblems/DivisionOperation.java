package com.xworkz.exceptionhandling.classproblems;

public class DivisionOperation {

	public static void main(String[] args) {

		System.out.println("Begin");

		DivisionOperation divopr = new DivisionOperation();

		divopr.division(10, 0);
		
//		try {
//			int result = divopr.division(10, 0);
//			System.out.println(result);
//		} 
//		catch (Exception e) {
//			System.out.println("Can't divide by zero");
//		}
		System.out.println("End");
	}

	int division(int a, int b)  {
		int div = a / b;
		return div;
	}
}
