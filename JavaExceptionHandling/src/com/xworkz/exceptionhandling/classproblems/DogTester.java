package com.xworkz.exceptionhandling.classproblems;

import java.util.Scanner;

public class DogTester {

	public static void main(String[] args) {

		System.out.println("Prog Begins");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
			int sum = a+b;
			System.out.println(sum);
			
			int x = 10, y = 0;
		try {
			int div = x/y;	//infinity, critical statement
			System.out.println(div);
			String name = null;
			int length = name.length();	//exception occurred jumps to catch block
			System.out.println("end of try");
//			System.out.println(name.length());
		}catch (ArithmeticException e) {
			System.out.println("you have entered zero for divisor, please enter a different value");
			e.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("please enter the name");
			e.printStackTrace();
		}
		
		Dog dog = null;	//its saying object is null
		try {
			dog.running();	//null.running
		}catch (NullPointerException e) {
			System.out.println("Initialize the object Dog before using");
			e.printStackTrace();
		}
		
		dog = new Dog("German Sheperd");
		dog.barking();
		dog.running();
		
		System.out.println("Prog ended");
	}

}
