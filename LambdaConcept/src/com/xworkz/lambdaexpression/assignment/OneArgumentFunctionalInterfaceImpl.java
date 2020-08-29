package com.xworkz.lambdaexpression.assignment;

public class OneArgumentFunctionalInterfaceImpl {

	public static void main(String[] args) {

		OneArgumentFunctionalInterface onearg = (a) ->
		//a+5;
		//System.out.println(onearg.incrementByFive(9));
		{
			return a+5;
		};
		System.out.println(onearg.incrementByFive(9));
	}

}
