package com.xworkz.casting;

public class TypeCastingAssignment {

	public static void main(String[] args) {

		char a ='A';
		int b = a;		//Auto widening
		
		int c = 76;		
		char d = (char)c;	//Narrowing explicitly
		
		System.out.println("char ASCII value: "+b);
		System.out.println("Equivalent char value for integer "+c+" = "+d);
		
	}

}
