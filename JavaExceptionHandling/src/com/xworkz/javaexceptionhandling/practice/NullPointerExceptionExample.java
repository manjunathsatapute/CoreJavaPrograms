package com.xworkz.javaexceptionhandling.practice;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		try {
			String name = "Manjunath";
			String s = null;
			System.out.println("Name length: "+name.length());
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			System.out.println(e+": Empty Strings, length can't be measured");
			System.out.println("yes correct");
		}
		finally{
			System.out.println("finally exception handled");
		}
		System.out.println("Thank you");
		
	}

}
