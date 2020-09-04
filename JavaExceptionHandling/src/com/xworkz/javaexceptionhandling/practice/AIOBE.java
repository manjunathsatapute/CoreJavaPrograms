package com.xworkz.javaexceptionhandling.practice;

public class AIOBE {

	public static void main(String[] args) {

		try {
			int array[] = new int[4];
			int array1[][] = new int[2][2];
			System.out.println(array[3]);
			System.out.println(array1[2][2]);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			int array[] = new int[4];
			int array1[][] = new int[2][2];
			System.out.println(array[3]);
			System.out.println(array1[2][2]);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
