package com.xworkz.javaexceptionhandling.practice;

public class NumberFromatExceptionExample {

	public static void main(String[] args) {

		try {
			String s = "abcd";
			char c = 'a';
			System.out.println(s);
			System.out.println(c);
			int i = Integer.parseInt(s);
			
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception handled");
		}
	}

}
