package com.xworkz.casting;

public class TypeCasting {

	public static void main(String[] args) {

		//auto widening
		int a =10;
		long b = a;	//auto widening
		
		//explicit narrowing: bigger to smaller datatypes
		long c = 1234567890l;
		int d = (int)c;	//casting
		
		int res = sum(a, b);	//int, long
		System.out.println(res);
		
		//multiple casting from right to left
		byte f = (byte)(long)(short)(int)10l;
		System.out.println(f);
	}
	
	static int sum(long a, double b) {
		int sum = (int) (a+b);
		return sum;
	}

}
