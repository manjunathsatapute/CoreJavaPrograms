package com.xworkz.lambdaexpression.assignment;

public class MultiArgumentImpl {

	public static void main(String[] args) {

		MultiArgument multiarg = (s1, s2) -> //s1+s2;
		//System.out.println(multiarg.concatTwoString("Hi", " Manju"));
		{
		return s1+s2;
		};
		
		System.out.println(multiarg.concatTwoString("Hi", " Manju"));
	}

}
